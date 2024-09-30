package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.mido.app.mymove.MoveInfo;
import org.mido.app.mymove.R;

import java.time.Instant;
import java.util.List;

import Model.MoveList;

public class MoveAdapter extends RecyclerView.Adapter<MoveAdapter.ViewHolder> {
    private Context context;
    private List<MoveList> listmove;

    public MoveAdapter(Context context, List<MoveList> listmove) {
        this.context = context;
        this.listmove = listmove;
    }


    @NonNull
    @Override
    public MoveAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.move_row,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MoveAdapter.ViewHolder holder, int position) {
        MoveList moveList = listmove.get(position);
        holder.name.setText(moveList.getName());
        holder.info.setText(moveList.getInfo());
        holder.more.setText(moveList.getMore());
        holder.img.setImageResource(moveList.getImg());
    }

    @Override
    public int getItemCount() {
        return listmove.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView name , info , more ;
        private ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name =itemView.findViewById(R.id.nameid);
            info = itemView.findViewById(R.id.infoid);
            more = itemView.findViewById(R.id.dateid);
            img = itemView.findViewById(R.id.imageView);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            MoveList moveList0 = listmove.get(position);

            Intent inti = new Intent(context , MoveInfo.class);
            inti.putExtra("name",moveList0.getName());
            inti.putExtra("info",moveList0.getInfo());
            inti.putExtra("date" , moveList0.getMore());
            inti.putExtra("img",moveList0.getImg());
            context.startActivity(inti);
        }
    }
}
