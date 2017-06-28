package firebaseappfest.com.leadtodoandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gaurav on 28/6/17.
 */

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectItemViewHolder> {

    List<Projects> list;
    Context context;

    public ProjectAdapter(Context context, List<Projects> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ProjectItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProjectItemViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_project, parent, false));
    }

    @Override
    public void onBindViewHolder(ProjectItemViewHolder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
        holder.createdBy.setText(list.get(position).getCreatedBy());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(List<Projects> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public Projects getProject(int pos) {
        return list.get(pos);
    }

    public class ProjectItemViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView createdBy;

        public ProjectItemViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.text_title);
            createdBy = (TextView) itemView.findViewById(R.id.text_created_by);
        }
    }
}
