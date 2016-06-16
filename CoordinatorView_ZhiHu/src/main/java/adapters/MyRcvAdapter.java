package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wyl.mytextlayout.R;

import java.util.ArrayList;
import java.util.List;

import beans.DataBean;

/**
 * ====================================
 * 作者：王月丽
 * 版本：1.0
 * 创建日期：2016/6/16 19:29
 * 创建描述：
 * 更新日期：
 * 更新描述：
 * ====================================
 */
public class MyRcvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    LayoutInflater inflater;
    List<DataBean> list=new ArrayList<>();

    public MyRcvAdapter(Context context, List<DataBean> list) {
        inflater=LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.rcv_item,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyHolder mHolder= (MyHolder) holder;
        mHolder.iv.setImageResource(list.get(position).getResId());
        mHolder.tv.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    public class  MyHolder extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView tv;
        public MyHolder(View itemView) {
            super(itemView);
            iv= (ImageView) itemView.findViewById(R.id.item_iv);
            tv= (TextView) itemView.findViewById(R.id.item_tv);
        }

    }
}
