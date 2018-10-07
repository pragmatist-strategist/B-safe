package com.womensafety.Dhruv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.womensafety.shajt3ch.R;


class Holder extends RecyclerView.ViewHolder {
    TextView choice;

    Context context;

    String type,demand_name;

    public Holder(final View itemView)  {
        super(itemView);
        context=itemView.getContext();


        choice=(TextView) itemView.findViewById(R.id.text_of_choice);



    }

    public void bindData(Model skillModel)
    {
        choice.setText(skillModel.name_of_choice);

    }
}
