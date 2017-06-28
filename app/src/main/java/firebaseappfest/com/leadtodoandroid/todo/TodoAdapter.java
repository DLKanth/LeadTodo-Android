package firebaseappfest.com.leadtodoandroid.todo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import firebaseappfest.com.leadtodoandroid.R;

/**
 * Created by gaurav on 28/6/17.
 */

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoItemViewHolder> {

    List<Todo> list;
    Context context;

    public TodoAdapter(Context context, List<Todo> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public TodoItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TodoItemViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_todo, parent, false));
    }

    @Override
    public void onBindViewHolder(TodoItemViewHolder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
        holder.assignedTo.setText(list.get(position).getAssignedTo());
        holder.status.setText(list.get(position).getStatus());
        holder.createdDate.setText(list.get(position).getCreatedDate());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(List<Todo> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public Todo getTodo(int pos) {
        return list.get(pos);
    }

    public class TodoItemViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView assignedTo;
        TextView status;
        TextView createdDate;

        public TodoItemViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.text_title);
            assignedTo = (TextView) itemView.findViewById(R.id.text_assigned_to);
            status = (TextView) itemView.findViewById(R.id.text_status);
            createdDate = (TextView) itemView.findViewById(R.id.text_created_date);
        }
    }
}
