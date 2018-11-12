SET FOREIGN_KEY_CHECKS=0;
CREATE TABLE `tb_user` (
  `user_id` varchar(32) NOT NULL,
  `open_id` varchar(32) DEFAULT NULL,
  `user_token` varchar(32) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `nickname` varchar(60) DEFAULT NULL,
  `avatar` varchar(200) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `ip` varchar(15) DEFAULT NULL,
  `pwd` varchar(48) DEFAULT NULL COMMENT '密码',
  `user_status` int(11) DEFAULT NULL COMMENT '用户状态',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `tb_user` VALUES ('027mz180926154259', 'o1W3T5ObWA2Q2qOW', 'El3VoWZzs392eIuEigLEVg==', null, '44CA', 'https://wx.qlogo.cn/mmopen/vi_32/Wx957kJTqEODGA8C8B3t2XZNYdFX8v4C2ph2q4OKZn47avHDeRIX85BY342e4ACWfjGk3xSXcA6iczqsDEvdnvA/132', '2', '2018-09-26 15:43:00', '2018-09-26 15:43:00', '127.0.0.1', '81791c33974c577a1cb8d63bc4ef99f8671ae9a905b44807', '0', '1');
INSERT INTO `tb_user` VALUES ('038p9180930094418', 'o1W3T5NsXdzFriEaqvC', '4DV8n1UUCCClTFuTsFwEXA==', 'Pudong New District', 'Tm9haOW9reaXl++9nGZyZWVseWtpY2vnjq/nkIPokKXlnLA=', 'https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJuLyTq71Se367swCOfgWVVRmZz2jjWTedOMdNiaK1kTOuUCgbus9pVRsInOkvGTe2Q6bb2tvqQo8A/132', '1', '2018-09-30 09:44:19', '2018-09-30 09:44:19', '127.0.0.1', '81791c33974c577a1cb8d63bc4ef99f8671ae9a905b44807', '0', '2');
INSERT INTO `tb_user` VALUES ('04013180922144403', 'o1W3T5MioPptQ_96Kg', 'ZuxsqYOoD/hxX+rcM6ZK6w==', null, '5Y2B5LiD', 'https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJu6UPy60jo9vtq82AfibzKVibFwH3q6BEHhxuJvba1WCuSt3DJfbDpaj2icDTQ7ZibSLXaNic7kkcO8ZQ/132', '1', '2018-09-22 14:44:04', '2018-09-22 14:44:04', '127.0.0.1', '81791c33974c577a1cb8d63bc4ef99f8671ae9a905b44807', '0', '3');
INSERT INTO `tb_user` VALUES ('049m0180922175221', 'o1W3T5CeZFAhQcfmox', '6n68MTbP5GfXHo5vMvbX3w==', 'Shaoyang', '6buY', 'https://wx.qlogo.cn/mmopen/vi_32/Xr2n12rEBAPbP86fF5yicQBhTm1ibljj8j1O7ewsicKEvhPj7NeeWiaYPSgt9VAgwNVDtTMDld9ztkjF2IHFfFrpZA/132', '1', '2018-09-22 17:52:21', '2018-09-22 17:52:21', '127.0.0.1', '81791c33974c577a1cb8d63bc4ef99f8671ae9a905b44807', '0', '4');
INSERT INTO `tb_user` VALUES ('067bp180924023157', 'o1W3T5Ox8GenvyK6XK', 'HCLdlDU8tOL/28Eb+LSeig==', null, '5aSa54K55b6u56yR77yM5bCR54K554Om5oG8', 'https://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83epgRTr7gIWxtiacJQVqic8OF9mxL1HBVRdQJCv5BzRJ0xAzJpQqrLz9CsnUeeJAzqic5UiciaPK4ffibKfw/132', '2', '2018-09-24 02:31:58', '2018-09-24 02:31:58', '127.0.0.1', '81791c33974c577a1cb8d63bc4ef99f8671ae9a905b44807', '0', '5');
INSERT INTO `tb_user` VALUES ('zq63k180922190601', 'o1W3T5DA3KJp3Ne8x9', 'OZNW94wbd9VrGH/fb2KlLw==', null, 'QS4gIOKcqOKcqOKcqOKcqOKcqA==', 'https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLNOlYwS9icU7rGxwqj364SNI2sadLZ9ZyumSicCPoZvhw93R4HcCIdOIicg11kA932zRFnTN2ro3wlw/132', '1', '2018-09-22 19:06:02', '2018-09-22 19:06:02', '127.0.0.1', '81791c33974c577a1cb8d63bc4ef99f8671ae9a905b44807', '0', '6');
