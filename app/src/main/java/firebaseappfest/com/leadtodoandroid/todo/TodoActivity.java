package firebaseappfest.com.leadtodoandroid.todo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import firebaseappfest.com.leadtodoandroid.R;
import firebaseappfest.com.leadtodoandroid.utils.ItemClickSupport;

public class TodoActivity extends AppCompatActivity implements TodoViewInterface {


    TodoPresenter presenter;
    TodoAdapter todoAdapter;
    RecyclerView todoRecyclerView;

    String projectId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        projectId = getIntent().getStringExtra("project_id");
        Log.d("projectId", projectId);
        presenter = new TodoPresenter(this);
        setRecyclerView();
        presenter.getTodos();
    }

    private void setRecyclerView() {
        todoRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_todo);
        todoRecyclerView.setHasFixedSize(true);
        todoRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        todoAdapter = new TodoAdapter(this, new ArrayList<Todo>());
        todoRecyclerView.setAdapter(todoAdapter);
        ItemClickSupport.addTo(todoRecyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {

            }
        });
    }


    @Override
    public void updateUI(List<Todo> list) {
        todoAdapter.setList(list);
    }
}
