package com.example.customlistviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyCharacterAdapter extends ArrayAdapter<MyCharacter> {
    Context context;
    int layoutId;
    MyCharacter[] data;

    public MyCharacterAdapter(@NonNull Context context, int resource, @NonNull MyCharacter[] objects) {
        super(context, resource, objects);
        this.context = context;
        layoutId = resource;
        data = objects;
    }

    @Nullable
    @Override
    public MyCharacter getItem(int position) {
        return data[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View layout = convertView;

        LayoutInflater inflater = LayoutInflater.from(context);
        layout = inflater.inflate(layoutId, parent, false);

        ImageView image = layout.findViewById(R.id.image);
        TextView title = layout.findViewById(R.id.title);
        TextView description = layout.findViewById(R.id.description);
        MyCharacter myCharacter = data[position];

        int imageResource = context
                .getResources()
                        .getIdentifier(
                                myCharacter.getImage(),
                                "drawable",
                                context.getPackageName()
                        );
        image.setImageResource(imageResource);
        title.setText(myCharacter.getTitle());
        description.setText(myCharacter.getDescription());

        return layout;
    }
}
