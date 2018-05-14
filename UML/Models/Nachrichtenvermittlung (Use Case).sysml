<?xml version="1.0" encoding="UTF-8"?>
<uml:Model xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:uml="http://www.eclipse.org/uml2/3.0.0/UML" xmi:id="idModel" name="main">
  <packagedElement xmi:type="uml:Package" xmi:id="idPackage" name="Nachrichtenvermittlung (Use Case)">
    <ownedRule xmi:type="uml:Constraint" xmi:id="_E0jf8FOMEeiwFIAYbclKzA" name="Constraint1"/>
    <packagedElement xmi:type="uml:Actor" xmi:id="_aJ47QFOLEeiwFIAYbclKzA" name="Sender"/>
    <packagedElement xmi:type="uml:Actor" xmi:id="_bxcu8FOLEeiwFIAYbclKzA" name="Empfänger"/>
    <packagedElement xmi:type="uml:Package" xmi:id="_dPv48FOLEeiwFIAYbclKzA" name="Package1"/>
    <packagedElement xmi:type="uml:UseCase" xmi:id="_qCa6MFOLEeiwFIAYbclKzA" name="Nachricht schreiben">
      <include xmi:type="uml:Include" xmi:id="_B2bh81OMEeiwFIAYbclKzA" name="Include1" addition="_sKdkwFOLEeiwFIAYbclKzA"/>
    </packagedElement>
    <packagedElement xmi:type="uml:UseCase" xmi:id="_rXRNQVOLEeiwFIAYbclKzA" name="Nachricht verschicken"/>
    <packagedElement xmi:type="uml:UseCase" xmi:id="_sKdkwFOLEeiwFIAYbclKzA" name="Nachricht verschlüsseln">
      <include xmi:type="uml:Include" xmi:id="_BQ7oMFOMEeiwFIAYbclKzA" name="Include1" addition="_rXRNQVOLEeiwFIAYbclKzA"/>
    </packagedElement>
    <packagedElement xmi:type="uml:Association" xmi:id="_zTD_JlOLEeiwFIAYbclKzA" name="" memberEnd="_zTD_J1OLEeiwFIAYbclKzA _zTD_KlOLEeiwFIAYbclKzA">
      <ownedEnd xmi:type="uml:Property" xmi:id="_zTD_J1OLEeiwFIAYbclKzA" name="empfänger" type="_bxcu8FOLEeiwFIAYbclKzA" association="_zTD_JlOLEeiwFIAYbclKzA">
        <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_zTD_KFOLEeiwFIAYbclKzA" value="1"/>
        <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_zTD_KVOLEeiwFIAYbclKzA" value="1"/>
      </ownedEnd>
      <ownedEnd xmi:type="uml:Property" xmi:id="_zTD_KlOLEeiwFIAYbclKzA" name="nachricht empfangen" type="_uTZAIFOLEeiwFIAYbclKzA" association="_zTD_JlOLEeiwFIAYbclKzA">
        <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_zTD_K1OLEeiwFIAYbclKzA" value="1"/>
        <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_zTD_LFOLEeiwFIAYbclKzA" value="1"/>
      </ownedEnd>
    </packagedElement>
    <packagedElement xmi:type="uml:Association" xmi:id="_3KHJNlOLEeiwFIAYbclKzA" name="" memberEnd="_3KHJN1OLEeiwFIAYbclKzA _3KHJOlOLEeiwFIAYbclKzA">
      <ownedEnd xmi:type="uml:Property" xmi:id="_3KHJN1OLEeiwFIAYbclKzA" name="sender" type="_aJ47QFOLEeiwFIAYbclKzA" association="_3KHJNlOLEeiwFIAYbclKzA">
        <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_3KHJOFOLEeiwFIAYbclKzA" value="1"/>
        <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_3KHJOVOLEeiwFIAYbclKzA" value="1"/>
      </ownedEnd>
      <ownedEnd xmi:type="uml:Property" xmi:id="_3KHJOlOLEeiwFIAYbclKzA" name="nachricht schreiben" type="_qCa6MFOLEeiwFIAYbclKzA" association="_3KHJNlOLEeiwFIAYbclKzA">
        <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_3KHJO1OLEeiwFIAYbclKzA" value="1"/>
        <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_3KHJPFOLEeiwFIAYbclKzA" value="1"/>
      </ownedEnd>
    </packagedElement>
    <packagedElement xmi:type="uml:Package" xmi:id="_IHPYsFOMEeiwFIAYbclKzA" name="Nachrichtenvermittlung">
      <packagedElement xmi:type="uml:UseCase" xmi:id="_uTZAIFOLEeiwFIAYbclKzA" name="Nachricht empfangen">
        <include xmi:type="uml:Include" xmi:id="_9MKLNFOLEeiwFIAYbclKzA" name="Include1" addition="_u7x10VOLEeiwFIAYbclKzA"/>
      </packagedElement>
      <packagedElement xmi:type="uml:UseCase" xmi:id="_u7x10VOLEeiwFIAYbclKzA" name="Nachricht entschlüsseln"/>
    </packagedElement>
  </packagedElement>
  <profileApplication xmi:type="uml:ProfileApplication" xmi:id="idProfileApplication">
    <eAnnotations xmi:type="ecore:EAnnotation" xmi:id="idProfileAnnotation" source="http://www.eclipse.org/uml2/2.0.0/UML">
      <references xmi:type="ecore:EPackage" href="pathmap://SysMLActivityExtensionsProfile.uml#ProfileContentId"/>
    </eAnnotations>
    <appliedProfile xmi:type="uml:Profile" href="pathmap://SysMLActivityExtensionsProfile.uml#ActivityProfileId"/>
  </profileApplication>
</uml:Model>
