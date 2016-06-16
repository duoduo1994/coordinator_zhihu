package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wyl.mytextlayout.R;

import java.util.ArrayList;
import java.util.List;

import adapters.MyRcvAdapter;
import beans.DataBean;

/**
 * ====================================
 * 作者：王月丽
 * 版本：1.0
 * 创建日期：2016/6/16 19:57
 * 创建描述：
 * 更新日期：
 * 更新描述：
 * ====================================
 */
public class Fragments extends Fragment {
    private RecyclerView rcv;
    private List<DataBean> list= new ArrayList<>();
    private MyRcvAdapter myRcvAdapter;

    public Fragments() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragments,container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcv= (RecyclerView) view.findViewById(R.id.fr_rcv);
        list.clear();
        for (int i = 0; i <20 ; i++) {
            list.add(new DataBean("item"+i,R.mipmap.ic_launcher));
        }
        rcv.setLayoutManager(new LinearLayoutManager(getActivity()));

        myRcvAdapter=new MyRcvAdapter(getActivity(),list);
        rcv.setAdapter(myRcvAdapter);
    }
}
