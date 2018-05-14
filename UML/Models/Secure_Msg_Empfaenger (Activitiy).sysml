<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.1" xmlns:xmi="http://schema.omg.org/spec/XMI/2.1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:SysMLActivityExtensionsProfile="http:///schemas/SysMLActivityExtensionsProfile/_QhUg4MpXEd6K76vGFchzLw/12" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:uml="http://www.eclipse.org/uml2/3.0.0/UML" xsi:schemaLocation="http:///schemas/SysMLActivityExtensionsProfile/_QhUg4MpXEd6K76vGFchzLw/12 pathmap://SysMLActivityExtensionsProfile.uml#ProfileContentId">
  <uml:Model xmi:id="idModel" name="Secure_Msg_Empfaenger (Activitiy)Model">
    <packagedElement xmi:type="uml:Package" xmi:id="idPackage" name="Secure_Msg_Empfaenger (Activitiy)Package">
      <packagedElement xmi:type="uml:Activity" xmi:id="idActivity" name="Secure_Msg_Empfaenger (Activitiy)Activity">
        <node xmi:type="uml:InitialNode" xmi:id="_m-6zUlOTEeiwFIAYbclKzA" name="InitialNode1"/>
        <node xmi:type="uml:InitialNode" xmi:id="_o63iolOTEeiwFIAYbclKzA" name="InitialNode2" outgoing="_2F71ylOTEeiwFIAYbclKzA _9l5nSlOTEeiwFIAYbclKzA"/>
        <node xmi:type="uml:OpaqueAction" xmi:id="_qaSuAlOTEeiwFIAYbclKzA" name="Nachricht empfangen" outgoing="_2Y_7uVOTEeiwFIAYbclKzA _9000GVOTEeiwFIAYbclKzA" incoming="_2F71ylOTEeiwFIAYbclKzA _9l5nSlOTEeiwFIAYbclKzA"/>
        <node xmi:type="uml:OpaqueAction" xmi:id="_qw2z4lOTEeiwFIAYbclKzA" name="Hauptprogramm öffnen" outgoing="_2y30SVOTEeiwFIAYbclKzA _-LwtaVOTEeiwFIAYbclKzA" incoming="_2Y_7uVOTEeiwFIAYbclKzA _9000GVOTEeiwFIAYbclKzA"/>
        <node xmi:type="uml:OpaqueAction" xmi:id="_q--vclOTEeiwFIAYbclKzA" name="Hilfetext anfordern" incoming="_3NwZeVOTEeiwFIAYbclKzA _-d93uVOTEeiwFIAYbclKzA"/>
        <node xmi:type="uml:OpaqueAction" xmi:id="_rORvslOTEeiwFIAYbclKzA" name="Abouttext anfordern" incoming="_3mRnKVOTEeiwFIAYbclKzA __EUtGVOTEeiwFIAYbclKzA"/>
        <node xmi:type="uml:OpaqueAction" xmi:id="_rfwhQlOTEeiwFIAYbclKzA" name="Nachricht entschlüsseln" outgoing="_4Qqn-VOTEeiwFIAYbclKzA _EqwxKFOUEeiwFIAYbclKzA" incoming="_36bSOVOTEeiwFIAYbclKzA __goOmFOTEeiwFIAYbclKzA"/>
        <node xmi:type="uml:ActivityFinalNode" xmi:id="_sLIZglOTEeiwFIAYbclKzA" name="ActivityFinalNode1" incoming="_4Qqn-VOTEeiwFIAYbclKzA _EqwxKFOUEeiwFIAYbclKzA"/>
        <node xmi:type="uml:MergeNode" xmi:id="_vFTro1OTEeiwFIAYbclKzA" name="" outgoing="_3NwZeVOTEeiwFIAYbclKzA _3mRnKVOTEeiwFIAYbclKzA _36bSOVOTEeiwFIAYbclKzA _-d93uVOTEeiwFIAYbclKzA __EUtGVOTEeiwFIAYbclKzA __goOmFOTEeiwFIAYbclKzA" incoming="_2y30SVOTEeiwFIAYbclKzA _-LwtaVOTEeiwFIAYbclKzA"/>
        <edge xmi:type="uml:ControlFlow" xmi:id="_2F71ylOTEeiwFIAYbclKzA" name="ControlFlow1" source="_o63iolOTEeiwFIAYbclKzA" target="_qaSuAlOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_2F71y1OTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_2F71zFOTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_2Y_7uVOTEeiwFIAYbclKzA" name="ControlFlow2" source="_qaSuAlOTEeiwFIAYbclKzA" target="_qw2z4lOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_2Y_7ulOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_2Y_7u1OTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_2y30SVOTEeiwFIAYbclKzA" name="ControlFlow3" source="_qw2z4lOTEeiwFIAYbclKzA" target="_vFTro1OTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_2y30SlOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_2y30S1OTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_3NwZeVOTEeiwFIAYbclKzA" name="ControlFlow4" source="_vFTro1OTEeiwFIAYbclKzA" target="_q--vclOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_3NwZelOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_3NwZe1OTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_3mRnKVOTEeiwFIAYbclKzA" name="ControlFlow5" source="_vFTro1OTEeiwFIAYbclKzA" target="_rORvslOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_3mRnKlOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_3mRnK1OTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_36bSOVOTEeiwFIAYbclKzA" name="ControlFlow6" source="_vFTro1OTEeiwFIAYbclKzA" target="_rfwhQlOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_36bSOlOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_36bSO1OTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_4Qqn-VOTEeiwFIAYbclKzA" name="ControlFlow7" source="_rfwhQlOTEeiwFIAYbclKzA" target="_sLIZglOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_4Qqn-lOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_4Qqn-1OTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_9l5nSlOTEeiwFIAYbclKzA" name="" source="_o63iolOTEeiwFIAYbclKzA" target="_qaSuAlOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_9l5nS1OTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_9l5nTFOTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_9000GVOTEeiwFIAYbclKzA" name="" source="_qaSuAlOTEeiwFIAYbclKzA" target="_qw2z4lOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_9000GlOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_9000G1OTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_-LwtaVOTEeiwFIAYbclKzA" name="" source="_qw2z4lOTEeiwFIAYbclKzA" target="_vFTro1OTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_-LwtalOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_-Lwta1OTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_-d93uVOTEeiwFIAYbclKzA" name="" source="_vFTro1OTEeiwFIAYbclKzA" target="_q--vclOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_-d93ulOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_-d93u1OTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="__EUtGVOTEeiwFIAYbclKzA" name="" source="_vFTro1OTEeiwFIAYbclKzA" target="_rORvslOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="__EUtGlOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="__EUtG1OTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="__goOmFOTEeiwFIAYbclKzA" name="" source="_vFTro1OTEeiwFIAYbclKzA" target="_rfwhQlOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="__goOmVOTEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="__goOmlOTEeiwFIAYbclKzA" value="1"/>
        </edge>
        <edge xmi:type="uml:ControlFlow" xmi:id="_EqwxKFOUEeiwFIAYbclKzA" name="ControlFlow8" source="_rfwhQlOTEeiwFIAYbclKzA" target="_sLIZglOTEeiwFIAYbclKzA">
          <guard xmi:type="uml:LiteralBoolean" xmi:id="_EqwxKVOUEeiwFIAYbclKzA" value="true"/>
          <weight xmi:type="uml:LiteralInteger" xmi:id="_EqwxKlOUEeiwFIAYbclKzA"/>
        </edge>
      </packagedElement>
    </packagedElement>
    <profileApplication xmi:type="uml:ProfileApplication" xmi:id="idProfileApplication">
      <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="idProfileAnnotation" source="http://www.eclipse.org/uml2/2.0.0/UML">
        <references xmi:type="ecore:EPackage" href="pathmap://SysMLActivityExtensionsProfile.uml#ProfileContentId"/>
      </eAnnotations>
      <appliedProfile xmi:type="uml:Profile" href="pathmap://SysMLActivityExtensionsProfile.uml#ActivityProfileId"/>
    </profileApplication>
  </uml:Model>
  <SysMLActivityExtensionsProfile:Rate xmi:id="_6kVTsFOTEeiwFIAYbclKzA" base_ActivityEdge="_2F71ylOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Probability xmi:id="_6kedoFOTEeiwFIAYbclKzA" base_ActivityEdge="_2F71ylOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Continuous xmi:id="_6kedoVOTEeiwFIAYbclKzA" base_ActivityEdge="_2F71ylOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Discrete xmi:id="_6kedolOTEeiwFIAYbclKzA" base_ActivityEdge="_2F71ylOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Rate xmi:id="_6kedo1OTEeiwFIAYbclKzA" base_ActivityEdge="_2Y_7uVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Probability xmi:id="_6kedpFOTEeiwFIAYbclKzA" base_ActivityEdge="_2Y_7uVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Continuous xmi:id="_6kedpVOTEeiwFIAYbclKzA" base_ActivityEdge="_2Y_7uVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Discrete xmi:id="_6kedplOTEeiwFIAYbclKzA" base_ActivityEdge="_2Y_7uVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Rate xmi:id="_6kedp1OTEeiwFIAYbclKzA" base_ActivityEdge="_2y30SVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Probability xmi:id="_6kedqFOTEeiwFIAYbclKzA" base_ActivityEdge="_2y30SVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Continuous xmi:id="_6kedqVOTEeiwFIAYbclKzA" base_ActivityEdge="_2y30SVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Discrete xmi:id="_6kedqlOTEeiwFIAYbclKzA" base_ActivityEdge="_2y30SVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Rate xmi:id="_6kedq1OTEeiwFIAYbclKzA" base_ActivityEdge="_3NwZeVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Probability xmi:id="_6kedrFOTEeiwFIAYbclKzA" base_ActivityEdge="_3NwZeVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Continuous xmi:id="_6kedrVOTEeiwFIAYbclKzA" base_ActivityEdge="_3NwZeVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Discrete xmi:id="_6kedrlOTEeiwFIAYbclKzA" base_ActivityEdge="_3NwZeVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Rate xmi:id="_6kedr1OTEeiwFIAYbclKzA" base_ActivityEdge="_36bSOVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Probability xmi:id="_6kedsFOTEeiwFIAYbclKzA" base_ActivityEdge="_36bSOVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Continuous xmi:id="_6kedsVOTEeiwFIAYbclKzA" base_ActivityEdge="_36bSOVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Discrete xmi:id="_6kedslOTEeiwFIAYbclKzA" base_ActivityEdge="_36bSOVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Rate xmi:id="_6keds1OTEeiwFIAYbclKzA" base_ActivityEdge="_3mRnKVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Probability xmi:id="_6kedtFOTEeiwFIAYbclKzA" base_ActivityEdge="_3mRnKVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Continuous xmi:id="_6kedtVOTEeiwFIAYbclKzA" base_ActivityEdge="_3mRnKVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Discrete xmi:id="_6kedtlOTEeiwFIAYbclKzA" base_ActivityEdge="_3mRnKVOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Rate xmi:id="_6kedt1OTEeiwFIAYbclKzA" base_ActivityEdge="_4Qqn-VOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Probability xmi:id="_6keduFOTEeiwFIAYbclKzA" base_ActivityEdge="_4Qqn-VOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Continuous xmi:id="_6keduVOTEeiwFIAYbclKzA" base_ActivityEdge="_4Qqn-VOTEeiwFIAYbclKzA"/>
  <SysMLActivityExtensionsProfile:Discrete xmi:id="_6kedulOTEeiwFIAYbclKzA" base_ActivityEdge="_4Qqn-VOTEeiwFIAYbclKzA"/>
</xmi:XMI>
