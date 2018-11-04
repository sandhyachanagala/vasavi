package vce.com.newvsv;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class QuestionsAdapter extends ArrayAdapter {
    Context context;
    ArrayList<Placement> arrayList;
    int resource;


    public QuestionsAdapter(@NonNull Context context, int resource, ArrayList<Placement> arrayList) {
        super(context, resource,arrayList);
        this.context=context;
        this.arrayList=arrayList;
        this.resource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.filteredquestionxml, null);
        Placement p=arrayList.get(position);
        TextView que=(TextView)v.findViewById(R.id.queBT);
        TextView sel=(TextView)v.findViewById(R.id.selectedB);
        que.setText(p.getQue());
        boolean sb=p.isSelected();
        if(sb==true){
            sel.setText("Selected");
        }
        else{
            sel.setText("Rejected");
        }
        return v;

    }
}
