
--
-- Table structure for table `feereport_parent`
--

CREATE TABLE IF NOT EXISTS `feereport_parent` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contactno` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `feereport_parent`
--

INSERT INTO `feereport_parent` (`id`, `name`, `password`, `email`, `contactno`) VALUES
(1, 'prateek_parent', 'prateek_p', 'prateek@gmail.com', '9199291212'),
(2, 'sonoo_parent', 'sonoo_p', 'sonoo@gmail.com', '939292932'),
(3, 'salman_parent', 'salman_p', 'salman@gmail.com', '939929322'),
(4, 'varun_parent', 'varun_p', 'varun@gmail.com', '9399239239'),
(5, 'abhi_parent', 'abhi_p', 'abhi@gmail.com', '93923923'),
(6, 'Roshan_parent', 'roshan_p', 'roshan@gmail.com', '9953030303');
