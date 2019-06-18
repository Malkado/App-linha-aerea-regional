package br.com.projeto20.Contoler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.projeto20.Model.ModelVoo;
import br.com.projeto20.R;

public class AdapterListVoo extends RecyclerView.Adapter<AdapterListVoo.MyViewHolder> {

    private List<ModelVoo>ListaDeVoos;
    public AdapterListVoo(List<ModelVoo>Lista) {
        this.ListaDeVoos=Lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_lista,viewGroup,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        ModelVoo modelVoo=ListaDeVoos.get(i);
        myViewHolder.numVoo.setText(modelVoo.getNumVoo());
        myViewHolder.destino.setText(modelVoo.getDestino());
        myViewHolder.partida.setText(modelVoo.getPartida());
        myViewHolder.precoVoo.setText(modelVoo.getPrecoVoo());
        myViewHolder.tempoPartida.setText(modelVoo.getTempoPartida());
        myViewHolder.tempoChegada.setText(modelVoo.getTempoDestino());
        myViewHolder.tempoVoo.setText(modelVoo.getTempoVoo());

    }

    @Override
    public int getItemCount() {
        return ListaDeVoos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView numVoo;
        TextView tempoVoo;
        TextView precoVoo;
        TextView partida;
        TextView destino;
        TextView tempoPartida;
        TextView tempoChegada;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            numVoo = itemView.findViewById(R.id.numVoo);
            tempoVoo= itemView.findViewById(R.id.tempoVoo);
            tempoChegada = itemView.findViewById(R.id.horarioChegada);
            tempoPartida= itemView.findViewById(R.id.horarioSaida);
            precoVoo = itemView.findViewById(R.id.price);
            partida = itemView.findViewById(R.id.textSaida);
            destino = itemView.findViewById(R.id.textChegada);
        }
    }
}
