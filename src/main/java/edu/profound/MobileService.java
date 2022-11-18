package edu.profound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MobileService {
	
	Mobile m1=new Mobile("qwe1","oPPO","aaa");
	Mobile m2=new Mobile("lll","mmm","nnn");
	Mobile m3=new Mobile("xxx","yyy","zzz");
	
	List<Mobile> mlist=new ArrayList<Mobile>(Arrays.asList(m1,m2,m3));
	
	public List<Mobile> getMobiles()
	{
		return mlist;
	}
	
	public  Mobile getMobile(String imeiNo)
	{
		Mobile m1=null;
		for(Mobile mobile:mlist)
		{
			if(mobile.getImeiNo().equals(imeiNo))
			{
				m1=mobile;
			}
		}
		return m1;
	}
	
	public void addMobile(Mobile m1)
	{
		mlist.add(m1);
	}
	
	public List<Mobile> deleteMobile(String imeiNo)
	{
		for(Mobile m1:mlist)
		{
			if(m1.getImeiNo().equals(imeiNo))
			{
				mlist.remove(m1);
			}
		}
		
		return mlist;
	}
	
	public List<Mobile> updateMobile(String imeiNo,Mobile m1)
	{
		for(Mobile m2:mlist)
		{
			if(m2.getImeiNo().equals(m1))
			{
				m2.setComName(m1.getComName());
                m2.setModelName(m1.getModelName());
			}
		}
		
		return mlist;
	}

}
