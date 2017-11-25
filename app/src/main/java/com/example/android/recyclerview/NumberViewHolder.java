package com.example.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

/**
 * Created by Ilya Solovyov on 25.11.2017.
 * is3k@ya.ru
 */

public class NumberViewHolder extends RecyclerView.ViewHolder {

    private TextView listItemNumberView;

    public NumberViewHolder(View itemView) {
        super(itemView);
        listItemNumberView = itemView.findViewById(R.id.tv_item_number);
    }

    void bind(int listindex) {
        listItemNumberView.setText(String.format(Locale.getDefault(), "%d", listindex));
    }


}
