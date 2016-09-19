#!/bin/bash
$(ps aux | grep 'sclang' | awk '{print "kill -9 " $2}')
$(ps aux | grep 'scsynth' | awk '{print "kill -9 " $2}')
$(ps aux | grep 'H.A.R.I.N.G' | awk '{print "kill -9 " $2}')


