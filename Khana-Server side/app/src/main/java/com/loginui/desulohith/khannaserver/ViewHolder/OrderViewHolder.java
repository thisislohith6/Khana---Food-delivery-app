package com.loginui.desulohith.khannaserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.loginui.desulohith.khannaserver.R;

/**
 * Created by Desu.Lohith on 21-04-2018.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder {

    public TextView txtOrderId,txtOrderStatus,txtOrderPhone,txtOrderAddress;

    public Button btnEdit,btnRemove,btnDetail;



        public OrderViewHolder(View itemView) {
            super(itemView);

            txtOrderAddress = (TextView)itemView.findViewById(R.id.order_address);
            txtOrderId = (TextView)itemView.findViewById(R.id.order_id);
            txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
            txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);

            btnEdit=(Button)itemView.findViewById(R.id.btnEdit);
            btnDetail=(Button)itemView.findViewById(R.id.btnDetail);
            btnRemove=(Button)itemView.findViewById(R.id.btnRemove);

        }
}


