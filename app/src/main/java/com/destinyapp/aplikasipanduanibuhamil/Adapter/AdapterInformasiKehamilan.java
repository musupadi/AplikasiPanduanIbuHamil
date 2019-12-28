package com.destinyapp.aplikasipanduanibuhamil.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.destinyapp.aplikasipanduanibuhamil.Activity.DetailInformasiActivity;
import com.destinyapp.aplikasipanduanibuhamil.Model.DataModel;
import com.destinyapp.aplikasipanduanibuhamil.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterInformasiKehamilan extends RecyclerView.Adapter<AdapterInformasiKehamilan.HolderData> implements Filterable {
    private List<DataModel> mList;
    private List<DataModel> mListFull;
    private Context ctx;

    public AdapterInformasiKehamilan(Context ctx, List<DataModel> mList) {
        this.ctx = ctx;
        this.mList = mList;
        mListFull = new ArrayList<>(mList);
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_informasi, viewGroup, false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterInformasiKehamilan.HolderData holderData, int posistion) {
        final DataModel dm = mList.get(posistion);
        holderData.tittle.setText(dm.getTittle());
        holderData.image.setImageResource(Integer.parseInt(dm.getGambar()));
        holderData.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(ctx, DetailInformasiActivity.class);
                goInput.putExtra("GAMBAR",dm.getGambar());
                goInput.putExtra("TITTLE",dm.getTittle());
                goInput.putExtra( "DESKRIPSI",dm.getDeskripsi());
                ctx.startActivities(new Intent[]{goInput});
            }
        });
        holderData.dm = dm;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class HolderData extends RecyclerView.ViewHolder {
        TextView tittle;
        DataModel dm;
        LinearLayout linear;
        ImageView image;

        HolderData(View v) {
            super(v);
            tittle = v.findViewById(R.id.tvTittle);
            image = v.findViewById(R.id.ivIcon);
            linear = v.findViewById(R.id.linearInformasiKehamilan);
        }
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    private Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<DataModel> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(mListFull);
            } else {
                String fillterPattern = constraint.toString().toLowerCase().trim();

                for (DataModel dm : mListFull) {
                    if (dm.getTittle().toLowerCase().contains(fillterPattern)) {
                        filteredList.add(dm);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            mList.clear();
            mList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };
}
