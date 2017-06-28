package firebaseappfest.com.leadtodoandroid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gaurav on 28/6/17.
 */

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectItemViewHolder> {

    List<Projects> list;
    @Override
    public ProjectItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ProjectItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
