package mayron.projeto12;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mayro on 08/11/2017.
 */

public class FragAdapter extends FragmentPagerAdapter {


    public FragAdapter(MainActivity mainActivity, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new CameraFragment();
            case 1:
                return new ConversasFragment();
            case 2:
                return new ChamadasFragment();
            case 3:
                return new StatusFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "";
            case 1:
                return "Conversas";
            case 2:
                return  "Chamadas";
            case 3:
                return "Status";
            default:
                return "NULL";
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
