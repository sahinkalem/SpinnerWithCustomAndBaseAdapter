package sahinkalem.spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class YearsBaseAdapter extends BaseAdapter {
    Context mContext;
   List<String> mList;

    public YearsBaseAdapter(Context mContext, List<String> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.spinner_item,null);
        TextView spinnerItem=view.findViewById(R.id.spinnerTextView);
        spinnerItem.setText(mList.get(position));

        return view;
    }


    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.spinner_item,null);

        TextView spinnerItem=view.findViewById(R.id.spinnerTextView);
        spinnerItem.setText(mList.get(position));

        return view;
    }
}
