/*
 * An XML document type.
 * Localname: getMotivosDeCancelamentoDoProtesto
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getMotivosDeCancelamentoDoProtesto(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetMotivosDeCancelamentoDoProtestoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMotivosDeCancelamentoDoProtestoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMOTIVOSDECANCELAMENTODOPROTESTO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMotivosDeCancelamentoDoProtesto");
    
    
    /**
     * Gets the "getMotivosDeCancelamentoDoProtesto" element
     */
    public br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtesto getGetMotivosDeCancelamentoDoProtesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtesto target = null;
            target = (br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtesto)get_store().find_element_user(GETMOTIVOSDECANCELAMENTODOPROTESTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMotivosDeCancelamentoDoProtesto" element
     */
    public void setGetMotivosDeCancelamentoDoProtesto(br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtesto getMotivosDeCancelamentoDoProtesto)
    {
        generatedSetterHelperImpl(getMotivosDeCancelamentoDoProtesto, GETMOTIVOSDECANCELAMENTODOPROTESTO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMotivosDeCancelamentoDoProtesto" element
     */
    public br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtesto addNewGetMotivosDeCancelamentoDoProtesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtesto target = null;
            target = (br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtesto)get_store().add_element_user(GETMOTIVOSDECANCELAMENTODOPROTESTO$0);
            return target;
        }
    }
}
