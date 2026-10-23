package com.example.disear_xml_daniel_ciurana;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {

    private final List<Chat> chats;

    public ChatAdapter(List<Chat> chats) {
        this.chats = chats;
    }

    public static class ChatViewHolder extends RecyclerView.ViewHolder {
        TextView nombre, mensaje, hora;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre);
            mensaje = itemView.findViewById(R.id.ultimoMensaje);
            hora = itemView.findViewById(R.id.hora);
        }
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_chat, parent, false);
        return new ChatViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        Chat c = chats.get(position);
        holder.nombre.setText(c.getNombre());
        holder.mensaje.setText(c.getMensaje());
        holder.hora.setText(c.getHora());
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }
}