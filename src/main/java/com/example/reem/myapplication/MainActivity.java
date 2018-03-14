package com.example.reem.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private MovieAdapter adapter;
private List<Movie> movieList;
ProgressDialog pd;
private SwipeRefreshLayout swipeContainer;
public static final string LOG_TAG=MoviesAdapter.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        swipeContainer=(SwipefreshLayout) findViewById (R.id.main_content);
        swipeContainer.setColorSchemeResoursers (android.R.color.hola_orange_dark);
        swipeContainer.setOnRefreshListerner(new SwipeRefreshLayout.OnRefreshListner()
        {
                public void onRefresh() {
                    initViews();
                    Toast.makeText(MainActivity.this."Movies Refreshed", Toast.LENGTN_SHORT).show();


                }
            });
        }

    public Activity getActivity()
    {
        context context=this;
        while (context instanceof contextWrapper)
        {
            if (context instanceof Activity)
            {
                return (Activity)context;
            }
            context = ((contextWrapper)context).getBaseContext();
        }
        return null;
    }

    private void initViews()
    {
    pd=new progressDialog (this)
            pd.setMessage("Fetching movies...");
    pd.setCancelable(false);
    pd.show();

    recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
    movieList= new ArraysList<>();
    adapter=new MovieAdapter(this,movieList);

    if (getActivity().getResources().getConfiguration().orientation == configration.ORIENRATION_PORTRAIT){
        recyclerView.setLAyoutManger(new GridLayoutManger (this,2));
    }else
    {
        recyclerView.setLAyoutManger(new GridLayoutManger (this,4));
    }

    recyclerView.setItemAnimator(new DefaultItemAnimator());
    recyclerView.setAdapter(adapter);
    //adapter.notifyDateSetChanged();

    loadJSON();
}

private void loadJSON()
{
try {
    if (BuildConfig.THE_MOVIE_DB_API_TOKEN.isEmpty()){
        toast.makeText(getApplicationContext(), "obtain API key",toast.LENGTN_SHORT)
                pd.dismiss();
        return;
    }
    client client=new clinet ();
    service apiService= client.getClient().create (service.class);
}

}
    }



