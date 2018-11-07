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

public class StatusFragment extends Fragment{
    public StatusFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_status, container, false);

        ListView listView = (ListView)root.findViewById(R.id.idLista);

        List<Sample> lista2 = new ArrayList<>(4);
        lista2.add(new Sample(R.drawable.cd, "Meu status", "Ontem, 22:54", false));
        lista2.add(new Sample(R.drawable.ij, "Isabella", "há 16 minutos", false));
        lista2.add(new Sample(R.drawable.kl, "Cláudio", "há 22 minutos", false));
        lista2.add(new Sample(R.drawable.mo, "Mônica", "há 28 minutos",false));

        //Criação do adaptador para esta lista
        SampleAdapter adapter2 = new SampleAdapter(root.getContext(), lista2);

        //Agora colocar as funcionalidades no listView
        //Setando o adaptador
        listView.setAdapter(adapter2);

        return root;
    }
}
