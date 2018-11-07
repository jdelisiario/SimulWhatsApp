package mayron.projeto12;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayro on 08/11/2017.
 */

public class ChamadasFragment extends Fragment{
    public ChamadasFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_chamadas, container, false);

        ListView listView = (ListView)root.findViewById(R.id.idLista);

        List<Sample2> lista2 = new ArrayList<>(5);
        lista2.add(new Sample2(R.drawable.ef, "Brunão", "25 de novembro, 20:15", R.drawable.telefone));
        lista2.add(new Sample2(R.drawable.op, "Bruno Alverto", "20 de novembro, 20:15", R.drawable.telefone));
        lista2.add(new Sample2(R.drawable.gh, "Angocito", "19 de novembro, 20:15", R.drawable.telefone));
        lista2.add(new Sample2(R.drawable.ab, "Bruno Alberto", "25 de novembro, 20:15", R.drawable.telefone));
        lista2.add(new Sample2(R.drawable.mn, "Bruno Alberto", "25 de novembro, 20:15", R.drawable.telefone));

        //Criação do adaptador para esta lista
        SampleAdapter2 adapter = new SampleAdapter2(root.getContext(),lista2);

        //Agora colocar as funcionalidades no listView
        //Setando o adaptador
        listView.setAdapter(adapter);

        return root;
    }
}
