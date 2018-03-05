package in.tutorialstack.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import in.tutorialstack.gridviewandroid.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String Names[];
    int Images[];
    LayoutInflater inflter;

    public CustomAdapter(Context context, String[] names, int[] images) {
        this.context = context;
        this.Names = names;
        this.Images = images;
        inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return Names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.lst_base_adapter_item, null);

        TextView txtName = (TextView) view.findViewById(R.id.txt_name);
        ImageView imgPic = (ImageView) view.findViewById(R.id.img_pic);

        txtName.setText(Names[i]);
        imgPic.setImageDrawable(context.getResources().getDrawable(Images[i]));

        return view;
    }
}