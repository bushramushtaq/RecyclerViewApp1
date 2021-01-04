package com.example.recyclerviewapp1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder>
{   String data[];
    public MyAdapter(String[] data) {
        this.data=data;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {   LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerow,parent,false);
        return new Holder(view);//capturing references of controls
                    // inside the singlerow.xmls through object of ViewHolder class
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position)
    {
        holder.textView.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

//inside the MyAdapter class the following Holder class is an inner class
    class Holder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;
        public Holder(@NonNull View itemView) //itemView is reference to singlerow
         {                                  // view of singlerow will be passed from
                                            //onCreateViewHolder()
             super(itemView);
            //the following two statements are taking references of ImageView
            //and TextView controls of singlerow layout file
            imageView=(ImageView)itemView.findViewById(R.id.img1);
            textView=(TextView)itemView.findViewById(R.id.textView1);

        }
    }
}
