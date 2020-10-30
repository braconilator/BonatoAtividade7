package br.usjt.ads20.appfilmes;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
    private ImageView image;
    private TextView name, info;

    public ViewHolder(ImageView image, TextView name, TextView infoHero) {
        this.image = image;
        this.name = name;
        info = infoHero;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    public TextView getInfo() {
        return info;
    }

    public void setInfo(TextView info) {
        this.info = info;
    }
}
