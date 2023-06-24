package com.example.winterproject.message

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.winterproject.R
import com.google.firebase.auth.FirebaseAuth
import kotlin.collections.ArrayList


class MessageAdapter(private val context: Context, private val messageList: ArrayList<Message>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val receive = 1 //받는 타입
    private val send = 2 //보내는 타입

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return if(viewType == 1){ //받는 화면
            val view: View = LayoutInflater.from(context).inflate(R.layout.receive, parent, false)
            ReceiveViewHolder(view)
        }else{ //보내는 화면
            val view: View = LayoutInflater.from(context).inflate(R.layout.send, parent, false)
            SendViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //현재 메시지
        val currentMessage = messageList[position]

        //보내는 데이터
        if(holder.javaClass == SendViewHolder::class.java){
            val viewHolder = holder as SendViewHolder
            viewHolder.timeSend.text = currentMessage.time
            viewHolder.sendMessage.text = currentMessage.message
            viewHolder.sendName.text = currentMessage.name

        }else{//받는 데이터
            val viewHolder = holder as ReceiveViewHolder
            viewHolder.timeReceive.text = currentMessage.time
            viewHolder.receiveMessage.text = currentMessage.message
            viewHolder.receiveName.text = currentMessage.name

        }
    }

    override fun getItemCount(): Int {
        return messageList.size
    }

    override fun getItemViewType(position: Int): Int {

        //메시지값
        val currentMessage = messageList[position]

        return if(FirebaseAuth.getInstance().currentUser?.uid.equals(currentMessage.sendId)){
            send
        }else{
            receive
        }
    }

    //보낸 쪽
    class SendViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val sendMessage: TextView = itemView.findViewById(R.id.send_message_text)
        val timeSend: TextView = itemView.findViewById(R.id.timeSender)
        val sendName: TextView = itemView.findViewById(R.id.senderName)
    }

    //받는 쪽
    class ReceiveViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val receiveMessage: TextView = itemView.findViewById(R.id.receive_message_text)
        val timeReceive: TextView = itemView.findViewById(R.id.timeReceiver)
        val receiveName: TextView = itemView.findViewById(R.id.receiverName)
    }
}