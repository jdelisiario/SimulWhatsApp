package mayron.projeto12;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager vp;

    private int white = Color.argb(255,255,255,255);
    private int green = Color.argb(255,111,255,4);
    private int pink = Color.argb(255,255,0,210);
    private int blue = Color.argb(255,63,81,181);

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_busca:
                Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_ngrupo:
                Toast.makeText(this, "Novo Grupo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_ntransmissao:
                Toast.makeText(this, "Nova Transmissão", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_whatsWeb:
                Toast.makeText(this, "WhatsApp Web", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_msgmarcadas:
                Toast.makeText(this, "Mensagens marcadas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_config:
                Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "Nenhum item selecionado", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        vp = (ViewPager) findViewById(R.id.viewPager);

        vp.setAdapter(new FragAdapter(this, getSupportFragmentManager()));
        tabLayout.setupWithViewPager(vp);

        tabLayout.setTabTextColors(white, green);
        tabLayout.setSelectedTabIndicatorColor(green);

        //vp.setCurrentItem(0);
        tabLayout.getTabAt(0).setIcon(R.drawable.camera);
        vp.setCurrentItem(1);

    }
}
