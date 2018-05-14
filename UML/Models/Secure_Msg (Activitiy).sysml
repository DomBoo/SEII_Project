<?xml version="1.0" encoding="UTF-8"?>
<uml:Model xmi:version="2.1" xmlns:xmi="http://schema.omg.org/spec/XMI/2.1" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:uml="http://www.eclipse.org/uml2/3.0.0/UML" xmi:id="idModel" name="Secure_Msg (Activitiy)Model">
  <packagedElement xmi:type="uml:Package" xmi:id="idPackage" name="Secure_Msg (Activitiy)Package">
    <packagedElement xmi:type="uml:Activity" xmi:id="idActivity" name="Secure_Msg (Activitiy)Activity">
      <ownedParameter xmi:type="uml:Parameter" xmi:id="_vrbNQFOPEeiwFIAYbclKzA" name="cvb"/>
      <ownedParameter xmi:type="uml:Parameter" xmi:id="_5NbH8FOPEeiwFIAYbclKzA" name="hgjhg"/>
      <ownedParameter xmi:type="uml:Parameter" xmi:id="_jHkOoFOQEeiwFIAYbclKzA" name="jhjh"/>
      <ownedParameter xmi:type="uml:Parameter" xmi:id="_pzX_UFOQEeiwFIAYbclKzA" name="jbbj"/>
      <ownedParameter xmi:type="uml:Parameter" xmi:id="_retfwFOQEeiwFIAYbclKzA" name="bjbj"/>
      <ownedParameter xmi:type="uml:Parameter" xmi:id="_yTHy0FOQEeiwFIAYbclKzA" name="tesat" direction="inout"/>
      <node xmi:type="uml:InitialNode" xmi:id="_6YxLoFONEeiwFIAYbclKzA" name="Sender" outgoing="_JFORqlOREeiwFIAYbclKzA _MOOC6lOREeiwFIAYbclKzA _UUrzuFOREeiwFIAYbclKzA"/>
      <node xmi:type="uml:InitialNode" xmi:id="_6yf6QFONEeiwFIAYbclKzA" name="Empfänger"/>
      <node xmi:type="uml:ExpansionRegion" xmi:id="_-JRBwFONEeiwFIAYbclKzA" name="ExpansionRegion1"/>
      <node xmi:type="uml:MergeNode" xmi:id="__elO4FONEeiwFIAYbclKzA" name=""/>
      <node xmi:type="uml:AcceptEventAction" xmi:id="_ELNWEFOOEeiwFIAYbclKzA" name="AcceptEventAction1"/>
      <node xmi:type="uml:CentralBufferNode" xmi:id="_P_9WglOOEeiwFIAYbclKzA" name="CentralBufferNode1">
        <upperBound xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_P_9Wg1OOEeiwFIAYbclKzA" value="*"/>
      </node>
      <node xmi:type="uml:ActivityFinalNode" xmi:id="_UJCrwFOOEeiwFIAYbclKzA" name="ActivityFinalNode1"/>
      <node xmi:type="uml:ActivityFinalNode" xmi:id="_nfHIklOOEeiwFIAYbclKzA" name="ActivityFinalNode2"/>
      <node xmi:type="uml:MergeNode" xmi:id="_uPyyM1OOEeiwFIAYbclKzA" name="MergeNode1"/>
      <node xmi:type="uml:DataStoreNode" xmi:id="_7EfMslOOEeiwFIAYbclKzA" name="DataStoreNode1">
        <upperBound xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_7EfMs1OOEeiwFIAYbclKzA" value="*"/>
      </node>
      <node xmi:type="uml:InputPin" xmi:id="_SijkMFOQEeiwFIAYbclKzA" name="InputPin1">
        <upperBound xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_SijkMVOQEeiwFIAYbclKzA" value="*"/>
      </node>
      <node xmi:type="uml:CentralBufferNode" xmi:id="_TA0NglOQEeiwFIAYbclKzA" name="CentralBufferNode2">
        <upperBound xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_TA0Ng1OQEeiwFIAYbclKzA" value="*"/>
      </node>
      <node xmi:type="uml:OpaqueAction" xmi:id="_UmtNQlOQEeiwFIAYbclKzA" name="OpaqueAction1"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_XMvbYlOQEeiwFIAYbclKzA" name="asdfasdf"/>
      <node xmi:type="uml:ActivityParameterNode" xmi:id="_pzX_VFOQEeiwFIAYbclKzA" name="jbbj" parameter="_pzX_UFOQEeiwFIAYbclKzA">
        <upperBound xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_pzX_VVOQEeiwFIAYbclKzA" value="*"/>
      </node>
      <node xmi:type="uml:ActivityParameterNode" xmi:id="_retfxFOQEeiwFIAYbclKzA" name="bjbj" parameter="_retfwFOQEeiwFIAYbclKzA">
        <upperBound xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_retfxVOQEeiwFIAYbclKzA" value="*"/>
      </node>
      <node xmi:type="uml:ActivityParameterNode" xmi:id="_yTHy1FOQEeiwFIAYbclKzA" name="tesat" parameter="_yTHy0FOQEeiwFIAYbclKzA">
        <upperBound xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_yTHy1VOQEeiwFIAYbclKzA" value="*"/>
      </node>
      <node xmi:type="uml:OpaqueAction" xmi:id="_55JwElOQEeiwFIAYbclKzA" name="Hauptprogramm öffnen" outgoing="_hMX32FOREeiwFIAYbclKzA _e9aQeVOSEeiwFIAYbclKzA" incoming="_JFORqlOREeiwFIAYbclKzA _MOOC6lOREeiwFIAYbclKzA _UUrzuFOREeiwFIAYbclKzA"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_-OhN0lOQEeiwFIAYbclKzA" name="Empfänger anzeigen" incoming="_GLY9ylOREeiwFIAYbclKzA _gW6aCVOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:MergeNode" xmi:id="_DFEGA1OREeiwFIAYbclKzA" name="" outgoing="_GLY9ylOREeiwFIAYbclKzA _gW6aCVOSEeiwFIAYbclKzA _gyHvWVOSEeiwFIAYbclKzA _kFEt2VOSEeiwFIAYbclKzA _kkAsmVOSEeiwFIAYbclKzA _laUCeVOSEeiwFIAYbclKzA" incoming="_hMX32FOREeiwFIAYbclKzA _e9aQeVOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_DUArglOSEeiwFIAYbclKzA" name=""/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_D_USUlOSEeiwFIAYbclKzA" name="Abouttext anfordern" incoming="_kFEt2VOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_Fjgo8lOSEeiwFIAYbclKzA" name="Hilfetextanfordern" incoming="_gyHvWVOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_HSxAElOSEeiwFIAYbclKzA" name="Nachricht schreiben" outgoing="_k7LPaVOSEeiwFIAYbclKzA _nNf3WFOSEeiwFIAYbclKzA" incoming="_kkAsmVOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_JaRfIlOSEeiwFIAYbclKzA" name="Key anfordern" incoming="_laUCeVOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_LPMZYFOSEeiwFIAYbclKzA" name=""/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_Lh4E0lOSEeiwFIAYbclKzA" name="Nachricht kürzen" outgoing="_mv_b-VOSEeiwFIAYbclKzA" incoming="_k7LPaVOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_TsTvolOSEeiwFIAYbclKzA" name="Nachricht verschlüsseln" outgoing="_oNAzmVOSEeiwFIAYbclKzA" incoming="_mv_b-VOSEeiwFIAYbclKzA _nNf3WFOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_XYg7olOSEeiwFIAYbclKzA" name="Key eingeben" outgoing="_oxA4iVOSEeiwFIAYbclKzA _rmw9qVOSEeiwFIAYbclKzA" incoming="_oNAzmVOSEeiwFIAYbclKzA _pMyOiFOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_Y2LzgFOSEeiwFIAYbclKzA" name="Falscher Key eingegeben" outgoing="_pMyOiFOSEeiwFIAYbclKzA" incoming="_oxA4iVOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:OpaqueAction" xmi:id="_a3OeMlOSEeiwFIAYbclKzA" name="Nachricht schicken" outgoing="_xQCTSVOSEeiwFIAYbclKzA" incoming="_rmw9qVOSEeiwFIAYbclKzA"/>
      <node xmi:type="uml:ActivityFinalNode" xmi:id="_dLpX4lOSEeiwFIAYbclKzA" name="ActivityFinalNode3" incoming="_xQCTSVOSEeiwFIAYbclKzA"/>
      <edge xmi:type="uml:ControlFlow" xmi:id="_GLY9ylOREeiwFIAYbclKzA" name="" source="_DFEGA1OREeiwFIAYbclKzA" target="_-OhN0lOQEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_GLY9y1OREeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_GLY9zFOREeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_JFORqlOREeiwFIAYbclKzA" name="" source="_6YxLoFONEeiwFIAYbclKzA" target="_55JwElOQEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_JFORq1OREeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_JFORrFOREeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_MOOC6lOREeiwFIAYbclKzA" name="" source="_6YxLoFONEeiwFIAYbclKzA" target="_55JwElOQEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_MOOC61OREeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_MOOC7FOREeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_UUrzuFOREeiwFIAYbclKzA" name="" source="_6YxLoFONEeiwFIAYbclKzA" target="_55JwElOQEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_UUrzuVOREeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_UUrzulOREeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_hMX32FOREeiwFIAYbclKzA" name="" source="_55JwElOQEeiwFIAYbclKzA" target="_DFEGA1OREeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_hMX32VOREeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_hMX32lOREeiwFIAYbclKzA"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_e9aQeVOSEeiwFIAYbclKzA" name="ControlFlow1" source="_55JwElOQEeiwFIAYbclKzA" target="_DFEGA1OREeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_e9aQelOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_e9aQe1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_gW6aCVOSEeiwFIAYbclKzA" name="ControlFlow2" source="_DFEGA1OREeiwFIAYbclKzA" target="_-OhN0lOQEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_gW6aClOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_gW6aC1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_gyHvWVOSEeiwFIAYbclKzA" name="ControlFlow3" source="_DFEGA1OREeiwFIAYbclKzA" target="_Fjgo8lOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_gyHvWlOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_gyHvW1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_kFEt2VOSEeiwFIAYbclKzA" name="ControlFlow4" source="_DFEGA1OREeiwFIAYbclKzA" target="_D_USUlOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_kFEt2lOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_kFEt21OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_kkAsmVOSEeiwFIAYbclKzA" name="ControlFlow5" source="_DFEGA1OREeiwFIAYbclKzA" target="_HSxAElOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_kkAsmlOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_kkAsm1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_k7LPaVOSEeiwFIAYbclKzA" name="ControlFlow6" source="_HSxAElOSEeiwFIAYbclKzA" target="_Lh4E0lOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_k7LPalOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_k7LPa1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_laUCeVOSEeiwFIAYbclKzA" name="ControlFlow7" source="_DFEGA1OREeiwFIAYbclKzA" target="_JaRfIlOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_laUCelOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_laUCe1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_mv_b-VOSEeiwFIAYbclKzA" name="ControlFlow8" source="_Lh4E0lOSEeiwFIAYbclKzA" target="_TsTvolOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_mv_b-lOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_mv_b-1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_nNf3WFOSEeiwFIAYbclKzA" name="ControlFlow9" source="_HSxAElOSEeiwFIAYbclKzA" target="_TsTvolOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_nNf3WVOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_nNf3WlOSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_oNAzmVOSEeiwFIAYbclKzA" name="ControlFlow10" source="_TsTvolOSEeiwFIAYbclKzA" target="_XYg7olOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_oNAzmlOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_oNAzm1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_oxA4iVOSEeiwFIAYbclKzA" name="ControlFlow11" source="_XYg7olOSEeiwFIAYbclKzA" target="_Y2LzgFOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_oxA4ilOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_oxA4i1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_pMyOiFOSEeiwFIAYbclKzA" name="ControlFlow12" source="_Y2LzgFOSEeiwFIAYbclKzA" target="_XYg7olOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_pMyOiVOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_pMyOilOSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_rmw9qVOSEeiwFIAYbclKzA" name="ControlFlow13" source="_XYg7olOSEeiwFIAYbclKzA" target="_a3OeMlOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_rmw9qlOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_rmw9q1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <edge xmi:type="uml:ControlFlow" xmi:id="_xQCTSVOSEeiwFIAYbclKzA" name="ControlFlow14" source="_a3OeMlOSEeiwFIAYbclKzA" target="_dLpX4lOSEeiwFIAYbclKzA">
        <guard xmi:type="uml:LiteralBoolean" xmi:id="_xQCTSlOSEeiwFIAYbclKzA" value="true"/>
        <weight xmi:type="uml:LiteralInteger" xmi:id="_xQCTS1OSEeiwFIAYbclKzA" value="1"/>
      </edge>
      <group xmi:type="uml:ActivityPartition" xmi:id="_G7Rp8FOOEeiwFIAYbclKzA" name="ActivityPartition1"/>
      <group xmi:type="uml:ActivityPartition" xmi:id="_x-hGslOOEeiwFIAYbclKzA" name="ActivityPartition2"/>
    </packagedElement>
  </packagedElement>
  <profileApplication xmi:type="uml:ProfileApplication" xmi:id="idProfileApplication">
    <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="idProfileAnnotation" source="http://www.eclipse.org/uml2/2.0.0/UML">
      <references xmi:type="ecore:EPackage" href="pathmap://SysMLActivityExtensionsProfile.uml#ProfileContentId"/>
    </eAnnotations>
    <appliedProfile xmi:type="uml:Profile" href="pathmap://SysMLActivityExtensionsProfile.uml#ActivityProfileId"/>
  </profileApplication>
</uml:Model>
