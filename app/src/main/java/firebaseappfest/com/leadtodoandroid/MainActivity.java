package firebaseappfest.com.leadtodoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import firebaseappfest.com.leadtodoandroid.todo.TodoActivity;
import firebaseappfest.com.leadtodoandroid.utils.ItemClickSupport;

public class MainActivity extends AppCompatActivity implements MainViewInterface {

    MainPresenter presenter;
    ProjectAdapter projectAdapter;
    RecyclerView projectRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        setRecyclerView();
        presenter.getProjects();
    }

    private void setRecyclerView() {
        projectRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_project);
        projectRecyclerView.setHasFixedSize(true);
        projectRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        projectAdapter = new ProjectAdapter(this, new ArrayList<Projects>());
        projectRecyclerView.setAdapter(projectAdapter);
        ItemClickSupport.addTo(projectRecyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Intent intent = new Intent(MainActivity.this, TodoActivity.class);
                intent.putExtra("project_id", projectAdapter.getProject(position).getId());
                startActivity(intent);
            }
        });
    }

    @Override
    public void updateUI(List<Projects> list) {
        projectAdapter.setList(list);
    }
}
