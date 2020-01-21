package TDA.Expleo.mirrorlinktest.Adapater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import TDA.Expleo.mirrorlinktest.Data.TextHolder;
import TDA.Expleo.mirrorlinktest.R;

public class FOListAdapter extends ArrayAdapter<TextHolder> {

    ArrayList<TextHolder> ArrayList;

    public FOListAdapter(@NonNull Context context, int resource, ArrayList<TextHolder> ArrayList) {
        super(context,0, ArrayList);
        this.ArrayList = ArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listviews,parent,false);
        }

        TextHolder textHolder = ArrayList.get(position);

        TextView textView1 = (TextView)convertView.findViewById(R.id.textview1);
        textView1.setText(textHolder.getText1());

        TextView textView2 = (TextView)convertView.findViewById(R.id.textview2);
        textView2.setText(textHolder.getText2());

        return convertView;
    }

    @Override
    public int getCount() {
        return ArrayList.size();
    }
}
