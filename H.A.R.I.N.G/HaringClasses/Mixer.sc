////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Automata Remixer
//
// * Mixer class
//
// Copyright (C) <2016>
//
// by Andrea Vogrig
// http://www.typedef.altervista.org
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program. If not, see <http://www.gnu.org/licenses/>.
Mixer{
	var <>m;
	*new {
		^super.new.init;
	}

	init{
		m = Ndef(\mixer, {
			var in1 = \in1.ar([0,0]);
			var in2 = \in2.ar([0,0]);
			var in3 = \in3.ar([0,0]);
			var in4 = \in4.ar([0,0]);
			var out = in1+in2+in3+in4;
			out;
		}).mold(2);
		{
			1.wait;
			Ndef(\mixer) <<>.in1 Ndef(\AutomataRMX_binPassFilter_0);
			Ndef(\mixer) <<>.in2 Ndef(\AutomataRMX_binPassFilter_1);
			Ndef(\mixer) <<>.in3 Ndef(\AutomataRMX_binPassFilter_2);
			Ndef(\mixer) <<>.in4 Ndef(\AutomataRMX_binPassFilter_3);
		}.fork;
	}

	stop{
		Ndef(\mixer).stop;
	}

	play{
		Ndef(\mixer).play(0);
	}
}


/*(
Ndef(\AutomataRMX_binPassFilter_0).play(0);
Ndef(\AutomataRMX_binPassFilter_1).play(0);
Ndef(\AutomataRMX_binPassFilter_2).play(0);
Ndef(\AutomataRMX_binPassFilter_3).play(0);
)
NdefMixer(s)*/