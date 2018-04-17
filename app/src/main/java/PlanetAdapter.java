import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rdrcorvera.labo5.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by UCA on 16/04/2018.
 */

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>{

    Context context;
    List<Planeta> planetList;


    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.card, parent);

        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) { //AQUI SE PUEDE ASIGNAR EL CONTENIDO
        holder.tittleTxtView.setText(planetList.get(position).getName());
        holder.descriptionTxtView.setText(planetList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    protected class PlanetViewHolder extends  RecyclerView.ViewHolder {
        TextView tittleTxtView;
        TextView descriptionTxtView;

        public PlanetViewHolder(View itemView) {
            super(itemView);
            tittleTxtView = itemView.findViewById(R.id.tittle);
            descriptionTxtView = itemView.findViewById(R.id.description);
        }
    }

}
