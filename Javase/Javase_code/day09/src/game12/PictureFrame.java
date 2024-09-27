package game12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PictureFrame extends JFrame {
    private int[][] datas = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    private int[][] winDatas = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    private int x0;
    private int y0;
    private JButton shangButton;
    private JButton zuoButton;
    private JButton xiaButton;
    private JButton youButton;
    private JButton qiuZhuButton;
    private JButton chongZhiButton;
    private JButton xiuzhengButton;
    private JPanel imagePanel;


    public PictureFrame() {
        initFrame();
        randomDate();
        paintView();
        xiuzhengButton.setEnabled(false);
        addButtonEvent();
        setVisible(true);
    }
    public void rePaintView() {
        imagePanel.removeAll();
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                JLabel imageLabel = new JLabel(new ImageIcon("day09\\images\\" + datas[i][j] + ".png"));
                imageLabel.setBounds(j * 90, i * 90, 90, 90);
                imagePanel.add(imageLabel);
            }
        }
        this.add(imagePanel);
        imagePanel.repaint();
        isxiuzheng();
    }
    public void success() {
        datas = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        shangButton.setEnabled(false);
        youButton.setEnabled(false);
        xiaButton.setEnabled(false);
        zuoButton.setEnabled(false);
    }
    public void isxiuzheng(){
        if(datas[0][0]==1&&datas[0][1]==2&&datas[0][2]==3&&datas[0][3]==4
                && datas[1][0]==5&&datas[1][1]==6&&datas[1][2]==7&&datas[1][3]==8
                && datas[2][0]==9&&datas[2][1]==10&&datas[3][0]==13&&datas[3][1]==14
                && (datas[3][2]!=15||datas[2][3]!=12||datas[2][2]!=11)){
            xiuzhengButton.setEnabled(true);
        }else{
            xiuzhengButton.setEnabled(false);
        }
    }
    public boolean isSuccess() {
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if (datas[i][j] != winDatas[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public void addButtonEvent() {
        xiuzhengButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp=datas[2][3];
                datas[2][3]=datas[3][2];
                datas[3][2]=temp;
                rePaintView();
            }
        });
        shangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x0 == 0) {
                    System.out.println("0号图片在最上层,不能进行上移动");
                    return;
                }
                datas[x0][y0] = datas[x0 - 1][y0];
                datas[x0 - 1][y0] = 0;
                x0 = x0 - 1;
                if (isSuccess()) {
                    success();
                }
                rePaintView();
            }
        });
        zuoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (y0 == 0) {
                    System.out.println("0号图片在最左边,不能进行左移动");
                    return;
                }
                datas[x0][y0] = datas[x0][y0 - 1];
                datas[x0][y0 - 1] = 0;
                y0 = y0 - 1;
                if (isSuccess()) {
                    success();
                }
                rePaintView();
            }
        });
        xiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x0 == 3) {
                    System.out.println("0号图片在最下层,不能进行下移动");
                    return;
                }
                datas[x0][y0] = datas[x0 + 1][y0];
                datas[x0 + 1][y0] = 0;
                x0 = x0 + 1;
                if (isSuccess()) {
                    success();
                }
                rePaintView();
            }
        });
        youButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (y0 == 3) {
                    System.out.println("0号图片在最右边,不能进行右移动");
                    return;
                }
                datas[x0][y0] = datas[x0][y0 + 1];
                datas[x0][y0 + 1] = 0;
                y0 = y0 + 1;
                if (isSuccess()) {
                    success();
                }
                rePaintView();
            }
        });
        qiuZhuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                success();
                rePaintView();
            }
        });
        chongZhiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datas = new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 0}
                };
                randomDate();
                rePaintView();
                shangButton.setEnabled(true);
                zuoButton.setEnabled(true);
                xiaButton.setEnabled(true);
                youButton.setEnabled(true);
            }
        });
    }

    public void paintView() {
        JLabel titleLabel = new JLabel(new ImageIcon("day09\\images\\title.png"));
        titleLabel.setBounds(254, 27, 232, 57);
        this.add(titleLabel);
        imagePanel = new JPanel();
        imagePanel.setBounds(150, 114, 360, 360);
        imagePanel.setLayout(null);
        for (int i = datas.length - 1; i >= 0; i--) {
            for (int j = 0; j < datas[i].length; j++) {
                JLabel imageLabel = new JLabel(new ImageIcon("day09\\images\\" + datas[i][j] + ".png"));
                imageLabel.setBounds(j * 90, i * 90, 90, 90);
                imagePanel.add(imageLabel);
            }
        }
        this.add(imagePanel);

        JLabel canZhaoTuLabel = new JLabel(new ImageIcon("day09\\images\\canZhaoTu.png"));
        canZhaoTuLabel.setBounds(574, 114, 122, 121);
        this.add(canZhaoTuLabel);
        shangButton = new JButton(new ImageIcon("day09\\images\\shang.png"));
        shangButton.setBounds(732, 265, 57, 57);
        this.add(shangButton);
        zuoButton = new JButton(new ImageIcon("day09\\images\\zuo.png"));
        zuoButton.setBounds(650, 347, 57, 57);
        this.add(zuoButton);
        xiaButton = new JButton(new ImageIcon("day09\\images\\xia.png"));
        xiaButton.setBounds(732, 347, 57, 57);
        this.add(xiaButton);
        youButton = new JButton(new ImageIcon("day09\\images\\you.png"));
        youButton.setBounds(813, 347, 57, 57);
        this.add(youButton);
        qiuZhuButton = new JButton(new ImageIcon("day09\\images\\qiuzhu.png"));
        qiuZhuButton.setBounds(626, 444, 108, 45);
        this.add(qiuZhuButton);
        chongZhiButton = new JButton(new ImageIcon("day09\\images\\chongzhi.png"));
        chongZhiButton.setBounds(786, 444, 108, 45);
        this.add(chongZhiButton);
        xiuzhengButton=new JButton(new ImageIcon("day09\\images\\xiuzheng.png"));
        xiuzhengButton.setBounds(843,0,105,35);
        this.add(xiuzhengButton);
        JLabel backgroundLabel = new JLabel(new ImageIcon("day09\\images\\background.png"));
        backgroundLabel.setBounds(0, 0, 968, 530);
        this.add(backgroundLabel);
    }
    public void initFrame() {
        this.setSize(960, 565);
        this.setTitle("动漫拼图");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }
    public void randomDate() {
        Random r = new Random();
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                int x = r.nextInt(datas.length);
                int y = r.nextInt(datas[i].length);
                int temp = datas[i][j];
                datas[i][j] = datas[x][y];
                datas[x][y] = temp;
            }
        }
        lo:
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if (datas[i][j] == 0) {
                    x0 = i;
                    y0 = j;
                    break lo;
                }
            }
        }
    }
}