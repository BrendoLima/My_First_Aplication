package com.example.newstudy;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.newstudy.dummy.DummyContent.Publicacao;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Publicacao}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final ArrayList<com.example.newstudy.Publicacao> publicacaoList;

    public MyItemRecyclerViewAdapter(ArrayList<com.example.newstudy.Publicacao> items) {
        publicacaoList = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.modelo_de_publicacao, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = publicacaoList.get(position);
        holder.Nome_do_Autor.setText(holder.mItem.nome);
        holder.Titulo.setText(holder.mItem.titulo);
        holder.Conteudo.setText(holder.mItem.conteudo);
    }

    @Override
    public int getItemCount() {
        return publicacaoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public com.example.newstudy.Publicacao mItem;

        TextView Nome_do_Autor;
        TextView Titulo;
        TextView Conteudo;
        public ViewHolder(View view) {
            super(view);
            Nome_do_Autor = view.findViewById(R.id.text_nome_autor);
            Titulo = view.findViewById(R.id.text_titulo_publicacao);
            Conteudo = view.findViewById(R.id.text_publicacao_conteudo);
        }
    }
}