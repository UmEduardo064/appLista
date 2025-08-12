package com.example.listguitarsplus;

import android.view.*;
import android.content.*;
import android.widget.*;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<GuitarItem> {

    public CustomAdapter(Context context, List<GuitarItem> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        final GuitarItem item = getItem(position);

        ImageView imageView = convertView.findViewById(R.id.item_image);
        TextView textView = convertView.findViewById(R.id.item_text);

        imageView.setImageResource(item.getImageResId());
        textView.setText(item.getName());

        // Configura o clique no item
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), GuitarDetailActivity.class);
                intent.putExtra("description", item.getDescription());
                getContext().startActivity(intent);
            }
        });

        return convertView;
    }
}

