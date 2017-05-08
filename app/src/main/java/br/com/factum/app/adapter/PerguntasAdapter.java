package br.com.factum.app.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

import br.com.factum.app.R;
import br.com.factum.app.model.Perguntas;
import br.com.factum.app.model.Resposta;

/**
 * Created by 16165877 on 05/04/2017.
 */

public class PerguntasAdapter extends ArrayAdapter<Perguntas> {

    int resource;

    public PerguntasAdapter(Context context, int resource, List<Perguntas> objects){
        super(context, resource, objects);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            v = LayoutInflater.from(getContext())
                    .inflate(resource, null);
        }

        Perguntas item = getItem(position);

        if (item != null) {

            TextView txt_pergunta = (TextView) v.findViewById(R.id.txt_pergunta_id);
            RadioButton radio1 = (RadioButton) v.findViewById(R.id.radio1);
            RadioButton radio2 = (RadioButton) v.findViewById(R.id.radio2);
            RadioButton radio3 = (RadioButton) v.findViewById(R.id.radio3);
            RadioButton radio4 = (RadioButton) v.findViewById(R.id.radio4);

            txt_pergunta.setText(item.getPergunta());

            Resposta[] respostas = item.getRespostas();

            radio1.setText(respostas[0].getTexto());
            radio2.setText(respostas[1].getTexto());
            radio3.setText(respostas[2].getTexto());
            radio4.setText(respostas[3].getTexto());

        }

        return v;
    }




}
