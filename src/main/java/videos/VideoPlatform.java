package videos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class VideoPlatform {
    List<Channel> channels = new ArrayList<>();

    public List<Channel> getChannels() {
        return channels;
    }

    public void readDataFromFile(Path path){
        channels.clear();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(";");
                String name  = row[0];
                int subscribers = Integer.valueOf(row[1]);
                int uploaded = Integer.valueOf(row[2]);
                channels.add(new Channel(name, subscribers, uploaded));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot open file for read!", ioe);
        }
    }

    public int calculateSumOfVideos(){
        int sum = 0;
        for(Channel actual : channels){
            sum += actual.getUploaded();
        }
        return sum;
    }

}
