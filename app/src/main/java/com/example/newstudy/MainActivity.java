package com.example.newstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MyItemRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*ImageButton botao_add = findViewById(R.id.image_autor);//

        //Quando clicar//
        botao_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
        ArrayList<Publicacao> publicacaoArrayList = new ArrayList<>();
        publicacaoArrayList.add(new Publicacao("Pedro", "O que é Google Meet?","Google Meet é um serviço de comunicação por vídeo desenvolvido pelo Google. É um dos dois serviços que substituem a versão anterior do Google Hangouts, o outro é o Google Chat. "));
        publicacaoArrayList.add(new Publicacao("Thiago", "Como compartilho minha reunião?","Acesse https://meet.google.com/. Selecione a reunião programada ou clique em Iniciar ou participar de uma reunião. Digite um código da reunião. Clique em Apresentar."));
        publicacaoArrayList.add(new Publicacao("João", "Existe um limite de pessoas?","O Google Meet gratuito manterá a quantidade máxima de participantes de até 100 pessoas após a data. Além disso, os usuários ainda poderão utilizar o serviço pelo navegador e pelos apps para celulares e tablets (Android e iOS)."));
        publicacaoArrayList.add(new Publicacao("Barquinho", "O que causa o Delay?","Se você tiver um computador antigo ou com pouca capacidade, estiver em uma rede com desempenho insatisfatório ou tiver outro software no computador ou dispositivos na rede que possam interferir nas videochamadas."));
        publicacaoArrayList.add(new Publicacao("Galileia", "Como remover alguém no Google Meet?","No smartphone\n" +
                "\n" +
                "Já, para remover ou fixar um participante no Google Meet pelo celular, você também deve acessar a seção pessoas, logo abaixo da tela de exibição, no canto esquerdo. Depois, basta tocar no nome da pessoa selecionada e nos respectivos ícones para fixar a tela ou remover a pessoa da reunião no Google Meet."));


        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyItemRecyclerViewAdapter(publicacaoArrayList);
//        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

    }
}
