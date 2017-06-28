package firebaseappfest.com.leadtodoandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

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
    }

    @Override
    public void updateUI(List<Projects> list) {
        projectAdapter.setList(list);
    }
}
