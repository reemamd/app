package com.example.reem.myapplication.model;
import java.util.List;
/**
 * Created by Reem on 3/3/18.
 */

public class Movie {

@SerializedName ("poster_path")
    private string posterPath;
@serializedName ("overview")
    private string overview;
    @serializedName ("id")
    private intger id;
    @serializedName ("title")
    private string title;
    @serializedName ("popularity")
    private double popularity;

    public Movie (String posterPath, string overview, interger id,string title,double popularity)
    {
        this.posterPath=posterPath;
        this.overview=overview;
        this.id=id;
        this.title=title;
        this.popularity= popularity;

    }
string baseImageUrl="https://image.tmdb.org/t/p/w500";
    public string getPosterPath(){
        return "http://image.tmdb.org/t/p/w500"+ posterPath;

    }

    public void setPosterPath (string posterPath)
    {
        this.posterPath = posterPath;
    }
    public string getOverview (){
        return overview;
    }
    public void setOverview (string overview)
    {
        this.overview=overview;
    }
    public string getTitle(){
        return title;
    }
    public void setTitle(string title){
        this.title=title;
    }
    public double getPopularity(){
        return popularity;
    }
    public void setPopularity(double popularity)
    {
        this.popularity=popularity;
    }
}


