package mayron.projeto12;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Jaciara on 31/10/2017.
 */
//Para usar o Adaptar deve extender a BaseAdapter pq o ArrayAdapter internamente tem o BaseAdapter
//BaseAdapter á uma classe abstrata que contém os métodos que precisam ser implementados
public class SampleAdapter extends BaseAdapter {
    private Context context;
    private List<Sample> lista;
    private Button botaoGo;

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        //O inflate age como se tivesse criando as View pra gente
        //Essa ação tá criando uma View para acessar o layout personalizado
        View v = LayoutInflater.from(context).inflate(R.layout.sample_item, parent, false);

        //Primeiro devemos pegar o objeto da lista
        final Sample sample = lista.get(position);

        //Acessar os componentes do layout
        ImageView imagem = (ImageView)v.findViewById(R.id.idImagem);
        TextView titulo = (TextView)v.findViewById(R.id.txtTit);
        TextView descricao = (TextView)v.findViewById(R.id.txtDesc);

        //Setar a imagem
        imagem.setImageResource(sample.getImagemID());

        //Setar o campo de texto do título
        titulo.setText(sample.getTitulo());

        //Setar o campo de texto da descrição
        descricao.setText(sample.getDescricao());

              return v;
    }

    //Construtor da classe
    public SampleAdapter(Context context, List<Sample> lista) {
        this.context = context;
        this.lista = lista;
    }
}
