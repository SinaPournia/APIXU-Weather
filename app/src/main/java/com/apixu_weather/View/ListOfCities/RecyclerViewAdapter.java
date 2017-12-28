package com.apixu_weather.View.ListOfCities;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apixu_weather.R;
import com.apixu_weather.ViewModel.RecyclerViewViewModel;
import com.apixu_weather.databinding.CitiesRecyclerViewItemBinding;

import java.util.List;

/**
 * Created by Sina on 12/27/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final List<RecyclerViewViewModel> recyclerViewViewModels;

    public RecyclerViewAdapter(List<RecyclerViewViewModel> recyclerViewViewModels) {
        this.recyclerViewViewModels = recyclerViewViewModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.cities_recycler_view_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
             holder.bind(recyclerViewViewModels.get(position));
    }

    @Override
    public int getItemCount() {
       return recyclerViewViewModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CitiesRecyclerViewItemBinding binding;

        public ViewHolder(View itemView) {

            super(itemView);
            binding= DataBindingUtil.bind(itemView);
        }

        public void bind(RecyclerViewViewModel recyclerViewViewModel){
            binding.setRecyclerViewViewModel(recyclerViewViewModel);
        }
    }
}
