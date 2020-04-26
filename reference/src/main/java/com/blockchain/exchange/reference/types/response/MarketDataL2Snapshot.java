package com.blockchain.exchange.reference.types.response;

import com.blockchain.exchange.reference.types.Channel;
import com.blockchain.exchange.reference.types.Event;

import java.util.List;
import java.util.Map;

/**
 * {
 *    "seqnum":1,
 *    "event":"snapshot",
 *    "channel":"l2",
 *    "symbol":"BTC-USD",
 *    "bids":[
 *       {
 *          "num":1,
 *          "px":0.2,
 *          "qty":1.0
 *       },
 *       {
 *          "num":1,
 *          "px":1.0,
 *          "qty":600.0
 *       },
 *       {
 *          "num":2,
 *          "px":4.4,
 *          "qty":10.56199279
 *       },
 *       {
 *          "num":2,
 *          "px":5.0,
 *          "qty":0.00108298
 *       },
 *       {
 *          "num":2,
 *          "px":6.0,
 *          "qty":0.00157635
 *       },
 *       {
 *          "num":1,
 *          "px":6.6,
 *          "qty":9.8433E-4
 *       },
 *       {
 *          "num":1,
 *          "px":9.5,
 *          "qty":0.00141542
 *       },
 *       {
 *          "num":2,
 *          "px":10.0,
 *          "qty":2.86969417
 *       },
 *       {
 *          "num":1,
 *          "px":15.3,
 *          "qty":0.00252606
 *       },
 *       {
 *          "num":1,
 *          "px":17.0,
 *          "qty":0.00168825
 *       },
 *       {
 *          "num":1,
 *          "px":30.0,
 *          "qty":0.0016978
 *       },
 *       {
 *          "num":1,
 *          "px":48.0,
 *          "qty":0.0065
 *       },
 *       {
 *          "num":1,
 *          "px":48.4,
 *          "qty":0.00660308
 *       },
 *       {
 *          "num":1,
 *          "px":65.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":67.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":68.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":80.0,
 *          "qty":0.00200328
 *       },
 *       {
 *          "num":1,
 *          "px":113.0,
 *          "qty":0.01133917
 *       },
 *       {
 *          "num":1,
 *          "px":117.0,
 *          "qty":2.0035
 *       },
 *       {
 *          "num":1,
 *          "px":219.2,
 *          "qty":0.0338
 *       },
 *       {
 *          "num":1,
 *          "px":500.0,
 *          "qty":0.2
 *       },
 *       {
 *          "num":1,
 *          "px":530.0,
 *          "qty":0.23884049
 *       },
 *       {
 *          "num":1,
 *          "px":875.0,
 *          "qty":0.02
 *       },
 *       {
 *          "num":2,
 *          "px":1000.0,
 *          "qty":2.58986178
 *       },
 *       {
 *          "num":2,
 *          "px":1200.0,
 *          "qty":6.01182025
 *       },
 *       {
 *          "num":1,
 *          "px":1227.0,
 *          "qty":0.06549849
 *       },
 *       {
 *          "num":1,
 *          "px":1250.0,
 *          "qty":0.07565798
 *       },
 *       {
 *          "num":1,
 *          "px":1500.0,
 *          "qty":0.08093196
 *       },
 *       {
 *          "num":1,
 *          "px":1990.0,
 *          "qty":0.05
 *       },
 *       {
 *          "num":2,
 *          "px":2500.0,
 *          "qty":0.47168921
 *       },
 *       {
 *          "num":1,
 *          "px":2600.0,
 *          "qty":0.54262533
 *       },
 *       {
 *          "num":1,
 *          "px":2750.0,
 *          "qty":30.0
 *       },
 *       {
 *          "num":1,
 *          "px":2960.1,
 *          "qty":0.01839091
 *       },
 *       {
 *          "num":1,
 *          "px":2990.0,
 *          "qty":0.03
 *       },
 *       {
 *          "num":2,
 *          "px":3000.0,
 *          "qty":60.50223506
 *       },
 *       {
 *          "num":1,
 *          "px":3005.0,
 *          "qty":0.0075
 *       },
 *       {
 *          "num":1,
 *          "px":3250.0,
 *          "qty":30.0
 *       },
 *       {
 *          "num":1,
 *          "px":3382.0,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":3490.0,
 *          "qty":0.03
 *       },
 *       {
 *          "num":3,
 *          "px":3500.0,
 *          "qty":30.39590183
 *       },
 *       {
 *          "num":1,
 *          "px":3512.4,
 *          "qty":0.00502719
 *       },
 *       {
 *          "num":1,
 *          "px":3700.0,
 *          "qty":0.05578201
 *       },
 *       {
 *          "num":1,
 *          "px":3706.0,
 *          "qty":0.012
 *       },
 *       {
 *          "num":1,
 *          "px":3880.0,
 *          "qty":0.03
 *       },
 *       {
 *          "num":2,
 *          "px":3900.0,
 *          "qty":56.06629186
 *       },
 *       {
 *          "num":1,
 *          "px":4105.0,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":4123.0,
 *          "qty":0.70873878
 *       },
 *       {
 *          "num":2,
 *          "px":4200.0,
 *          "qty":0.50442031
 *       },
 *       {
 *          "num":1,
 *          "px":4300.0,
 *          "qty":0.64408536
 *       },
 *       {
 *          "num":1,
 *          "px":4303.0,
 *          "qty":0.025
 *       },
 *       {
 *          "num":1,
 *          "px":4500.0,
 *          "qty":0.030664
 *       },
 *       {
 *          "num":1,
 *          "px":4501.0,
 *          "qty":0.06
 *       },
 *       {
 *          "num":1,
 *          "px":4507.0,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":4810.0,
 *          "qty":1.25754635
 *       },
 *       {
 *          "num":1,
 *          "px":4823.0,
 *          "qty":0.02343935
 *       },
 *       {
 *          "num":1,
 *          "px":4854.0,
 *          "qty":0.20982894
 *       },
 *       {
 *          "num":1,
 *          "px":4890.0,
 *          "qty":0.02
 *       },
 *       {
 *          "num":3,
 *          "px":4900.0,
 *          "qty":0.672
 *       },
 *       {
 *          "num":3,
 *          "px":5000.0,
 *          "qty":0.01768293
 *       },
 *       {
 *          "num":1,
 *          "px":5100.0,
 *          "qty":0.00256637
 *       },
 *       {
 *          "num":1,
 *          "px":5102.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":5200.0,
 *          "qty":0.01030021
 *       },
 *       {
 *          "num":1,
 *          "px":5300.0,
 *          "qty":0.02282057
 *       },
 *       {
 *          "num":1,
 *          "px":5346.0,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":5476.0,
 *          "qty":0.05445992
 *       },
 *       {
 *          "num":3,
 *          "px":5600.0,
 *          "qty":0.32397771
 *       },
 *       {
 *          "num":1,
 *          "px":5620.0,
 *          "qty":0.00888432
 *       },
 *       {
 *          "num":1,
 *          "px":5630.0,
 *          "qty":0.17678251
 *       },
 *       {
 *          "num":2,
 *          "px":5700.0,
 *          "qty":0.020067
 *       },
 *       {
 *          "num":1,
 *          "px":5727.0,
 *          "qty":0.01810904
 *       },
 *       {
 *          "num":1,
 *          "px":5797.0,
 *          "qty":1.03858816
 *       },
 *       {
 *          "num":1,
 *          "px":5800.0,
 *          "qty":0.00887864
 *       },
 *       {
 *          "num":1,
 *          "px":5805.0,
 *          "qty":0.08944029
 *       },
 *       {
 *          "num":1,
 *          "px":5867.0,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":5900.0,
 *          "qty":0.4
 *       },
 *       {
 *          "num":1,
 *          "px":5950.0,
 *          "qty":0.00188499
 *       },
 *       {
 *          "num":6,
 *          "px":6000.0,
 *          "qty":0.22646128
 *       },
 *       {
 *          "num":1,
 *          "px":6010.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":3,
 *          "px":6100.0,
 *          "qty":0.14245804
 *       },
 *       {
 *          "num":1,
 *          "px":6150.0,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":1,
 *          "px":6180.0,
 *          "qty":0.03005229
 *       },
 *       {
 *          "num":2,
 *          "px":6200.0,
 *          "qty":0.001465
 *       },
 *       {
 *          "num":1,
 *          "px":6215.0,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":1,
 *          "px":6230.0,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":1,
 *          "px":6250.0,
 *          "qty":0.00667508
 *       },
 *       {
 *          "num":1,
 *          "px":6260.0,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":1,
 *          "px":6265.0,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":1,
 *          "px":6270.0,
 *          "qty":5.0001E-4
 *       },
 *       {
 *          "num":3,
 *          "px":6300.0,
 *          "qty":0.44662734
 *       },
 *       {
 *          "num":1,
 *          "px":6375.0,
 *          "qty":0.11800473
 *       },
 *       {
 *          "num":3,
 *          "px":6400.0,
 *          "qty":0.21451258
 *       },
 *       {
 *          "num":2,
 *          "px":6500.0,
 *          "qty":0.0215
 *       },
 *       {
 *          "num":2,
 *          "px":6501.0,
 *          "qty":0.05690761
 *       },
 *       {
 *          "num":1,
 *          "px":6520.0,
 *          "qty":0.0031611
 *       },
 *       {
 *          "num":4,
 *          "px":6600.0,
 *          "qty":1.41091331
 *       },
 *       {
 *          "num":1,
 *          "px":6601.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":6650.0,
 *          "qty":0.082509
 *       },
 *       {
 *          "num":1,
 *          "px":6660.0,
 *          "qty":0.00764377
 *       },
 *       {
 *          "num":2,
 *          "px":6700.0,
 *          "qty":0.00111001
 *       },
 *       {
 *          "num":1,
 *          "px":6750.0,
 *          "qty":0.2
 *       },
 *       {
 *          "num":1,
 *          "px":6780.0,
 *          "qty":0.00166855
 *       },
 *       {
 *          "num":1,
 *          "px":6790.0,
 *          "qty":0.00350563
 *       },
 *       {
 *          "num":7,
 *          "px":6800.0,
 *          "qty":1.13449624
 *       },
 *       {
 *          "num":1,
 *          "px":6801.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":6820.0,
 *          "qty":0.2
 *       },
 *       {
 *          "num":1,
 *          "px":6870.0,
 *          "qty":0.02565298
 *       },
 *       {
 *          "num":1,
 *          "px":6890.0,
 *          "qty":0.2
 *       },
 *       {
 *          "num":5,
 *          "px":6900.0,
 *          "qty":0.34095517
 *       },
 *       {
 *          "num":1,
 *          "px":6901.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":6905.0,
 *          "qty":0.2
 *       },
 *       {
 *          "num":1,
 *          "px":6940.0,
 *          "qty":5.0001E-4
 *       },
 *       {
 *          "num":1,
 *          "px":6950.0,
 *          "qty":0.05099125
 *       },
 *       {
 *          "num":1,
 *          "px":6955.0,
 *          "qty":0.2
 *       },
 *       {
 *          "num":8,
 *          "px":7000.0,
 *          "qty":0.3630845
 *       },
 *       {
 *          "num":1,
 *          "px":7001.0,
 *          "qty":0.01429
 *       },
 *       {
 *          "num":1,
 *          "px":7001.1,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":7002.4,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7005.0,
 *          "qty":0.29208246
 *       },
 *       {
 *          "num":1,
 *          "px":7007.7,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7009.9,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7011.4,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7015.4,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7017.5,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7020.0,
 *          "qty":0.0283577
 *       },
 *       {
 *          "num":3,
 *          "px":7050.0,
 *          "qty":0.16858394
 *       },
 *       {
 *          "num":1,
 *          "px":7055.0,
 *          "qty":0.2
 *       },
 *       {
 *          "num":3,
 *          "px":7100.0,
 *          "qty":1.54144011
 *       },
 *       {
 *          "num":1,
 *          "px":7119.3,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7121.0,
 *          "qty":0.02
 *       },
 *       {
 *          "num":1,
 *          "px":7121.1,
 *          "qty":0.015
 *       },
 *       {
 *          "num":2,
 *          "px":7130.0,
 *          "qty":0.05537647
 *       },
 *       {
 *          "num":5,
 *          "px":7200.0,
 *          "qty":0.29476313
 *       },
 *       {
 *          "num":1,
 *          "px":7221.0,
 *          "qty":0.54851752
 *       },
 *       {
 *          "num":1,
 *          "px":7279.0,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":1,
 *          "px":7280.0,
 *          "qty":0.002
 *       },
 *       {
 *          "num":5,
 *          "px":7300.0,
 *          "qty":1.07694349
 *       },
 *       {
 *          "num":1,
 *          "px":7383.0,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":3,
 *          "px":7400.0,
 *          "qty":0.23552391
 *       },
 *       {
 *          "num":1,
 *          "px":7421.0,
 *          "qty":0.9
 *       },
 *       {
 *          "num":1,
 *          "px":7438.0,
 *          "qty":0.003546
 *       },
 *       {
 *          "num":1,
 *          "px":7439.4,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7450.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":7453.9,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":2,
 *          "px":7460.0,
 *          "qty":0.17698915
 *       },
 *       {
 *          "num":1,
 *          "px":7463.7,
 *          "qty":9.8507E-4
 *       },
 *       {
 *          "num":1,
 *          "px":7469.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":7472.0,
 *          "qty":0.002
 *       },
 *       {
 *          "num":1,
 *          "px":7490.0,
 *          "qty":0.50830184
 *       },
 *       {
 *          "num":3,
 *          "px":7500.0,
 *          "qty":0.00934569
 *       },
 *       {
 *          "num":1,
 *          "px":7501.0,
 *          "qty":0.03808063
 *       },
 *       {
 *          "num":1,
 *          "px":7512.1,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7525.0,
 *          "qty":0.002
 *       },
 *       {
 *          "num":1,
 *          "px":7529.6,
 *          "qty":0.26
 *       },
 *       {
 *          "num":1,
 *          "px":7543.3,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7550.0,
 *          "qty":0.00285406
 *       },
 *       {
 *          "num":1,
 *          "px":7567.7,
 *          "qty":0.18
 *       },
 *       {
 *          "num":1,
 *          "px":7570.0,
 *          "qty":1.56872416
 *       },
 *       {
 *          "num":1,
 *          "px":7574.9,
 *          "qty":5.1E-4
 *       },
 *       {
 *          "num":1,
 *          "px":7580.0,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":1,
 *          "px":7601.7,
 *          "qty":3.9361
 *       },
 *       {
 *          "num":1,
 *          "px":7605.8,
 *          "qty":0.11
 *       },
 *       {
 *          "num":1,
 *          "px":7607.8,
 *          "qty":3.9369
 *       },
 *       {
 *          "num":1,
 *          "px":7611.2,
 *          "qty":36.0
 *       },
 *       {
 *          "num":1,
 *          "px":7611.8,
 *          "qty":3.01
 *       },
 *       {
 *          "num":2,
 *          "px":7612.2,
 *          "qty":47.8
 *       },
 *       {
 *          "num":1,
 *          "px":7613.8,
 *          "qty":2.01
 *       },
 *       {
 *          "num":1,
 *          "px":7613.9,
 *          "qty":1.76824305
 *       },
 *       {
 *          "num":3,
 *          "px":7614.2,
 *          "qty":12.69238852
 *       },
 *       {
 *          "num":1,
 *          "px":7615.7,
 *          "qty":1.01
 *       },
 *       {
 *          "num":1,
 *          "px":7616.7,
 *          "qty":0.689
 *       },
 *       {
 *          "num":1,
 *          "px":7617.1,
 *          "qty":1.0
 *       },
 *       {
 *          "num":1,
 *          "px":7620.1,
 *          "qty":0.138
 *       }
 *    ],
 *    "asks":[
 *       {
 *          "num":1,
 *          "px":7623.4,
 *          "qty":1.01
 *       },
 *       {
 *          "num":1,
 *          "px":7625.4,
 *          "qty":0.138
 *       },
 *       {
 *          "num":1,
 *          "px":7625.8,
 *          "qty":0.689
 *       },
 *       {
 *          "num":2,
 *          "px":7626.8,
 *          "qty":11.31
 *       },
 *       {
 *          "num":1,
 *          "px":7627.5,
 *          "qty":2.82432858
 *       },
 *       {
 *          "num":1,
 *          "px":7627.9,
 *          "qty":1.9684
 *       },
 *       {
 *          "num":1,
 *          "px":7628.8,
 *          "qty":19.6
 *       },
 *       {
 *          "num":2,
 *          "px":7629.3,
 *          "qty":4.01
 *       },
 *       {
 *          "num":1,
 *          "px":7629.8,
 *          "qty":36.0
 *       },
 *       {
 *          "num":1,
 *          "px":7630.0,
 *          "qty":4.14E-5
 *       },
 *       {
 *          "num":1,
 *          "px":7630.3,
 *          "qty":26.8
 *       },
 *       {
 *          "num":1,
 *          "px":7632.2,
 *          "qty":3.9374
 *       },
 *       {
 *          "num":1,
 *          "px":7633.3,
 *          "qty":49.31
 *       },
 *       {
 *          "num":1,
 *          "px":7636.2,
 *          "qty":0.11
 *       },
 *       {
 *          "num":1,
 *          "px":7638.5,
 *          "qty":3.9381
 *       },
 *       {
 *          "num":1,
 *          "px":7640.3,
 *          "qty":49.22
 *       },
 *       {
 *          "num":1,
 *          "px":7642.2,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7649.9,
 *          "qty":7.09446452
 *       },
 *       {
 *          "num":1,
 *          "px":7650.0,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":1,
 *          "px":7656.0,
 *          "qty":0.09914162
 *       },
 *       {
 *          "num":1,
 *          "px":7665.0,
 *          "qty":0.0015
 *       },
 *       {
 *          "num":1,
 *          "px":7670.2,
 *          "qty":0.00317741
 *       },
 *       {
 *          "num":1,
 *          "px":7674.3,
 *          "qty":0.18
 *       },
 *       {
 *          "num":1,
 *          "px":7680.0,
 *          "qty":0.03794965
 *       },
 *       {
 *          "num":1,
 *          "px":7690.0,
 *          "qty":0.002
 *       },
 *       {
 *          "num":4,
 *          "px":7700.0,
 *          "qty":1.01616407
 *       },
 *       {
 *          "num":1,
 *          "px":7702.9,
 *          "qty":5.2E-4
 *       },
 *       {
 *          "num":2,
 *          "px":7710.0,
 *          "qty":0.20051
 *       },
 *       {
 *          "num":1,
 *          "px":7712.4,
 *          "qty":0.26
 *       },
 *       {
 *          "num":1,
 *          "px":7723.2,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":7733.3,
 *          "qty":0.015
 *       },
 *       {
 *          "num":2,
 *          "px":7740.0,
 *          "qty":1.006
 *       },
 *       {
 *          "num":1,
 *          "px":7748.7,
 *          "qty":0.01
 *       },
 *       {
 *          "num":4,
 *          "px":7750.0,
 *          "qty":0.01669047
 *       },
 *       {
 *          "num":1,
 *          "px":7759.9,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":7793.0,
 *          "qty":0.015
 *       },
 *       {
 *          "num":1,
 *          "px":7793.5,
 *          "qty":0.01
 *       },
 *       {
 *          "num":4,
 *          "px":7800.0,
 *          "qty":0.0529381
 *       },
 *       {
 *          "num":1,
 *          "px":7813.0,
 *          "qty":5.0E-4
 *       },
 *       {
 *          "num":1,
 *          "px":7820.0,
 *          "qty":0.02657295
 *       },
 *       {
 *          "num":1,
 *          "px":7840.0,
 *          "qty":1.0
 *       },
 *       {
 *          "num":1,
 *          "px":7850.0,
 *          "qty":0.01380157
 *       },
 *       {
 *          "num":1,
 *          "px":7893.0,
 *          "qty":0.02
 *       },
 *       {
 *          "num":1,
 *          "px":7899.0,
 *          "qty":0.007
 *       },
 *       {
 *          "num":4,
 *          "px":7900.0,
 *          "qty":1.03006181
 *       },
 *       {
 *          "num":1,
 *          "px":7929.0,
 *          "qty":0.02
 *       },
 *       {
 *          "num":1,
 *          "px":7980.0,
 *          "qty":0.00211089
 *       },
 *       {
 *          "num":1,
 *          "px":7999.0,
 *          "qty":0.05
 *       },
 *       {
 *          "num":6,
 *          "px":8000.0,
 *          "qty":1.67077903
 *       },
 *       {
 *          "num":1,
 *          "px":8068.7,
 *          "qty":0.0011761
 *       },
 *       {
 *          "num":1,
 *          "px":8081.0,
 *          "qty":0.00137962
 *       },
 *       {
 *          "num":1,
 *          "px":8158.7,
 *          "qty":0.00137962
 *       },
 *       {
 *          "num":2,
 *          "px":8200.0,
 *          "qty":0.01087437
 *       },
 *       {
 *          "num":1,
 *          "px":8201.0,
 *          "qty":5.0001E-4
 *       },
 *       {
 *          "num":1,
 *          "px":8250.0,
 *          "qty":0.01103067
 *       },
 *       {
 *          "num":1,
 *          "px":8275.2,
 *          "qty":0.00137963
 *       },
 *       {
 *          "num":1,
 *          "px":8301.0,
 *          "qty":5.1E-4
 *       },
 *       {
 *          "num":1,
 *          "px":8372.0,
 *          "qty":0.15939734
 *       },
 *       {
 *          "num":1,
 *          "px":8430.7,
 *          "qty":0.00137962
 *       },
 *       {
 *          "num":1,
 *          "px":8445.0,
 *          "qty":0.05
 *       },
 *       {
 *          "num":1,
 *          "px":8463.0,
 *          "qty":0.0102
 *       },
 *       {
 *          "num":1,
 *          "px":8474.0,
 *          "qty":0.00484235
 *       },
 *       {
 *          "num":1,
 *          "px":8625.0,
 *          "qty":0.0010916
 *       },
 *       {
 *          "num":1,
 *          "px":8692.0,
 *          "qty":0.015
 *       },
 *       {
 *          "num":2,
 *          "px":9000.0,
 *          "qty":0.00945375
 *       },
 *       {
 *          "num":1,
 *          "px":9111.4,
 *          "qty":0.01165078
 *       },
 *       {
 *          "num":1,
 *          "px":9150.0,
 *          "qty":0.00133766
 *       },
 *       {
 *          "num":1,
 *          "px":9200.0,
 *          "qty":0.00121357
 *       },
 *       {
 *          "num":2,
 *          "px":9500.0,
 *          "qty":0.00155834
 *       },
 *       {
 *          "num":1,
 *          "px":9736.8,
 *          "qty":0.00106954
 *       },
 *       {
 *          "num":1,
 *          "px":9750.0,
 *          "qty":0.00910485
 *       },
 *       {
 *          "num":1,
 *          "px":9909.0,
 *          "qty":0.65270518
 *       },
 *       {
 *          "num":5,
 *          "px":10000.0,
 *          "qty":0.02314122
 *       },
 *       {
 *          "num":1,
 *          "px":10070.1,
 *          "qty":0.00100138
 *       },
 *       {
 *          "num":1,
 *          "px":10200.0,
 *          "qty":0.01346045
 *       },
 *       {
 *          "num":1,
 *          "px":10231.4,
 *          "qty":0.00123857
 *       },
 *       {
 *          "num":1,
 *          "px":10250.0,
 *          "qty":0.001
 *       },
 *       {
 *          "num":1,
 *          "px":10289.0,
 *          "qty":0.46046664
 *       },
 *       {
 *          "num":1,
 *          "px":10304.3,
 *          "qty":0.001
 *       },
 *       {
 *          "num":2,
 *          "px":10400.0,
 *          "qty":0.08411982
 *       },
 *       {
 *          "num":3,
 *          "px":10500.0,
 *          "qty":0.24260573
 *       },
 *       {
 *          "num":1,
 *          "px":10501.0,
 *          "qty":0.01731308
 *       },
 *       {
 *          "num":1,
 *          "px":10624.0,
 *          "qty":0.005
 *       },
 *       {
 *          "num":1,
 *          "px":10900.0,
 *          "qty":0.14695779
 *       },
 *       {
 *          "num":2,
 *          "px":11000.0,
 *          "qty":0.01457779
 *       },
 *       {
 *          "num":1,
 *          "px":11111.0,
 *          "qty":0.0061
 *       },
 *       {
 *          "num":1,
 *          "px":12000.0,
 *          "qty":0.82718574
 *       },
 *       {
 *          "num":1,
 *          "px":13200.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":13420.0,
 *          "qty":0.02
 *       },
 *       {
 *          "num":1,
 *          "px":13500.0,
 *          "qty":9.2172E-4
 *       },
 *       {
 *          "num":1,
 *          "px":14000.0,
 *          "qty":0.01
 *       },
 *       {
 *          "num":1,
 *          "px":14332.1,
 *          "qty":0.00137963
 *       },
 *       {
 *          "num":2,
 *          "px":15000.0,
 *          "qty":0.07945306
 *       },
 *       {
 *          "num":1,
 *          "px":17495.8,
 *          "qty":0.00232965
 *       },
 *       {
 *          "num":1,
 *          "px":19641.0,
 *          "qty":0.0130365
 *       },
 *       {
 *          "num":1,
 *          "px":21860.9,
 *          "qty":0.1
 *       },
 *       {
 *          "num":1,
 *          "px":23112.0,
 *          "qty":7.2965E-4
 *       },
 *       {
 *          "num":1,
 *          "px":25550.0,
 *          "qty":0.00116427
 *       },
 *       {
 *          "num":1,
 *          "px":27008.0,
 *          "qty":9.2965E-4
 *       },
 *       {
 *          "num":1,
 *          "px":29673.7,
 *          "qty":0.010005
 *       },
 *       {
 *          "num":1,
 *          "px":30003.0,
 *          "qty":6.2965E-4
 *       },
 *       {
 *          "num":1,
 *          "px":31653.7,
 *          "qty":5.0001E-4
 *       },
 *       {
 *          "num":1,
 *          "px":32222.3,
 *          "qty":0.00211112
 *       },
 *       {
 *          "num":1,
 *          "px":33953.6,
 *          "qty":0.00147337
 *       },
 *       {
 *          "num":1,
 *          "px":35000.7,
 *          "qty":0.00146498
 *       },
 *       {
 *          "num":1,
 *          "px":45000.0,
 *          "qty":0.02960236
 *       },
 *       {
 *          "num":1,
 *          "px":64733.0,
 *          "qty":0.01229168
 *       }
 *    ]
 * }
 */
public class MarketDataL2Snapshot extends Response {
    public String symbol;
    public List<MarketDataL2Level> bids;
    public List<MarketDataL2Level> asks;

    /**
     *
     * @param seqnum
     * @param event
     * @param channel
     * @param symbol
     * @param bids ordered by increasing px
     * @param asks ordered by increasing px
     */
    public MarketDataL2Snapshot(
            Long seqnum,
            Event event,
            Channel channel,
            String symbol,
            List<MarketDataL2Level> bids,
            List<MarketDataL2Level> asks
    ) {
        super(seqnum, event, channel, null);
        this.symbol = symbol;
        this.bids = bids;
        this.asks = asks;
    }
}