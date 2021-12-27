package com.example.diansjava.repository;

import com.example.diansjava.model.Kafic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class KaficRepository {
    private final String databasePath = "C:\\Users\\User\\Desktop\\DiansJava\\src\\main\\resources\\mkcafe.csv";

    public List<Kafic> findAll(String tip)
    {
        List<Kafic> sviKafici=new ArrayList<>();
        String path=String.format("%s ",databasePath);
        File file=new File(path);
        try{
            BufferedReader bla=new BufferedReader(new FileReader(file));
            String line=bla.readLine();
            while((line=bla.readLine())!=null)
            {
                String[] pom=line.split(",");
                if(pom[4]==tip)
                {
                    sviKafici.add(new Kafic(pom[3],pom[4]));
                }
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        return sviKafici;
    }
}
