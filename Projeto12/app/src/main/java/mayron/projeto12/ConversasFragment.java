package mayron.projeto12;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jaciara on 27/11/2017.
 */

public class ConversasFragment extends Fragment{

        public ConversasFragment() {

        }


        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View root = inflater.inflate(R.layout.fragment_conversas, container, false);

            ListView listView = (ListView)root.findViewById(R.id.idLista);

            List<Sample> lista = new ArrayList<>(5);
            lista.add(new Sample(R.drawable.ef, "Mayron", "Fala Gay"));
            lista.add(new Sample(R.drawable.op, "Jaciara", "Alguém traz alguma coisa pra comer"));
            lista.add(new Sample(R.drawable.gh, "Paulinelly", "Aí trabalha heim kkkk"));
            lista.add(new Sample(R.drawable.ab, "Silvio Sala", "Quero matar alguém uahahaha"));
            lista.add(new Sample(R.drawable.mn, "Amigo Oculto Comp01", "Que dia vamos sortear?"));

            //Criação do adaptador para esta lista
            SampleAdapter adapter = new SampleAdapter(root.getContext(), lista);

            //Agora colocar as funcionalidades no listView
            //Setando o adaptador
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position){
                        case 0:
                            Intent intent1 = new Intent(getContext(), ConversaActivity.class);
                            startActivity(intent1);
                            break;
                        case 1:
                            Intent intent2 = new Intent(getContext(), ConversaActivity.class);
                            startActivity(intent2);
                            break;
                        case 2:
                            Intent intent3 = new Intent(getContext(), ConversaActivity.class);
                            startActivity(intent3);
                            break;
                        case 3:
                            Intent intent4 = new Intent(getContext(), ConversaActivity.class);
                            startActivity(intent4);
                            break;
                        case 4:
                            Intent intent5 = new Intent(getContext(), ConversaActivity.class);
                            startActivity(intent5);
                            break;
                    }
                }
            });

            return root;
        }
}
