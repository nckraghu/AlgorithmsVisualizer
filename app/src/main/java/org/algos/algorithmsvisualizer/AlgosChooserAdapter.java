package org.algos.algorithmsvisualizer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Kalyan on 11-03-2017.
 */

public class AlgosChooserAdapter extends RecyclerView.Adapter<AlgosChooserAdapter.AlgosRecyclerViewHolder> {


    private final List<String> algosData;

    public AlgosChooserAdapter(List<String> algosData){
        this.algosData = algosData;
    }

    @Override
    public AlgosRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.algos_recycler_layout, parent, false);

        AlgosRecyclerViewHolder algosRecyclerViewHolder = new AlgosRecyclerViewHolder(view);

        return algosRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(AlgosRecyclerViewHolder holder, int position) {
        holder.algoNameTextView.setText(algosData.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return algosData.size();
    }

    public static class AlgosRecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView algoNameTextView;

        public AlgosRecyclerViewHolder(View itemView) {
            super(itemView);

            algoNameTextView = (TextView) itemView.findViewById(R.id.algo_name);
        }
    }

}
