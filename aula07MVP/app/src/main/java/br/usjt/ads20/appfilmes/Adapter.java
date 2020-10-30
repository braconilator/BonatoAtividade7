package br.usjt.ads20.appfilmes;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;

import java.util.Hashtable;

import br.usjt.ads20.appfilmes.model.Hero;

public class Adapter extends BaseAdapter implements SectionIndexer {
    private Hero[] heroList;
    private Context context;
    private Object[] sectionHeaders;
    private Hashtable<Integer, Integer> positionForSectionMap;
    private Hashtable<Integer, Integer> sectionForPositionMap;

    public Adapter(Context context, Hero[] heroList) {
        this.heroList = heroList;
        this.context = context;
        sectionHeaders = SectionIndexBuilder.buildSectionHeaders(heroList);
        positionForSectionMap = SectionIndexBuilder.buildPositionForSectionMap(heroList);
        sectionForPositionMap = SectionIndexBuilder.buildSectionForPosition(heroList);

    }

    @Override
    public int getCount() {
        return heroList.length;
    }

    @Override
    public Object getItem(int i) {
        if(i >=0 && i < heroList.length) {
            return heroList[i];
        } else {
            return null;
        }
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.custom_view, viewGroup, false);
            ImageView posterFilme = (ImageView) view.findViewById(R.id.image);
            TextView nomeFilme = (TextView) view.findViewById(R.id.name);
            TextView detalheFilme = (TextView) view.findViewById(R.id.info);
            view.setTag(new ViewHolder(posterFilme, nomeFilme, detalheFilme));
        }
        ViewHolder holder = (ViewHolder)view.getTag();
//        Drawable drawable = Util.getDrawable(context,
//                heroList[i].getPosterPath().toLowerCase());
//        holder.getImage().setImageDrawable(drawable);
        holder.getName().setText(heroList[i].getTitulo());

        return view;
    }

    @Override
    public Object[] getSections() {
        return sectionHeaders;
    }

    @Override
    public int getPositionForSection(int sectionIndex) {
        return positionForSectionMap.get(sectionIndex).intValue();
    }

    @Override
    public int getSectionForPosition(int position) {
        return sectionForPositionMap.get(position).intValue();
    }
}
