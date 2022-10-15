package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ibo.recyclerview.InfoActivity;
import com.ibo.recyclerview.R;

import java.util.List;

import Model.Listitem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<Listitem> listitems;

    public MyAdapter(Context context, List listitem) {
        this.context=context;
        this.listitems=listitem;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder viewHolder, int i) {

        Listitem item=listitems.get(i);
        //viewHolder.name.setText("ibo");
        //viewHolder.description.setText("Wahbeh");

        viewHolder.name.setText(item.getName());
        viewHolder.description.setText(item.getDescription());
        viewHolder.age.setText(item.getAge());

    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView name;
        private TextView description;
        private TextView age;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            name=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.detalis);
            age=itemView.findViewById(R.id.age);
        }

        @Override
        public void onClick(View v) {
            int position=getAdapterPosition();
            Listitem item=listitems.get(position);
            //Toast.makeText(context,item.getName(),Toast.LENGTH_SHORT).show();

            Intent intent=new Intent(context, InfoActivity.class);
            intent.putExtra("name",item.getName());
            intent.putExtra("description",item.getDescription());
            intent.putExtra("age",item.getAge());
            context.startActivity(intent);

        }
    }
}
