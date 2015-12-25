package com.company;

/**
 * Created by pc on 22.12.2015.
 */

import javax.sound.midi.*;
public class Midi {
   static MidiEvent ev(int a,int b,int c,int d,int e){
        ShortMessage sm = new ShortMessage();
        try {
            sm.setMessage(a, b, c, d);
        } catch(Exception ex){};

        MidiEvent noteOne = new MidiEvent(sm,e);
        return(noteOne);
    };

    static void play(Draw D)  {
        int mass[] = {127};

        try{
        Sequencer player = MidiSystem.getSequencer();
            player.open();
            player.addControllerEventListener(new ControllerEventListener() {
                @Override
                public void controlChange(ShortMessage event) {
                  D.repaint();
                }
            },mass);
          Sequence seq = new Sequence(Sequence.PPQ,4);
            Track t = seq.createTrack();
            int rnd1=(int) (Math.random()*127);
            for(int i=20;i<101;i++){
                t.add(ev(144,1,i,100,i));
                t.add(ev(176,1,127,0,i));
                t.add(ev(128,1,i,100,i+1));
            }


            player.setSequence(seq);
            player.setTempoInBPM(220);
            player.start();
    } catch(Exception ex){
        }
    };
}
